package com.github.chengzhx76.shop.common.entity.id;

/**
 * Desc: http://cloudate.net/?p=575
 * Author: cheng
 * Date: 2016/6/22
 */
public class IdGenerator {
    // 机器ID
    private final long workerId;

    // 纪元开始时间
    private final static long twepoch = 1361753741828L;

    // Sequence从0开始
    private long sequence = 0L;

    // 机器ID所占的位数
    private final static long workerIdBits = 4L;

    // 机器ID的最大值
    public final static long maxWorkerId = -1L ^ -1L << workerIdBits;

    // Sequence所占的位数
    private final static long sequenceBits = 10L;

    // 机器ID的偏移量
    private final static long workerIdShift = sequenceBits;

    // 时间戳的偏移量
    private final static long timestampLeftShift = sequenceBits + workerIdBits;

    // Sequence的屏蔽位
    public final static long sequenceMask = -1L ^ -1L << sequenceBits;

    // 上一个毫秒数
    private long lastTimestamp = -1L;

    public IdGenerator(final long workerId) {
        super();
        // 最大16个节点
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }
        this.workerId = workerId;
    }

    public synchronized long nextId() {
        long timestamp = this.timeGen();
        if (this.lastTimestamp == timestamp) {
            // 在统一毫秒内产生
            this.sequence = (this.sequence + 1) & this.sequenceMask;
            if (this.sequence == 0) {
                // 同一毫秒内的ID已经用光了，等到下一毫秒才能继续产生
                System.out.println("###########" + sequenceMask);
                timestamp = this.tilNextMillis(this.lastTimestamp);
            }
        } else {
            // 上一次的毫秒已经过去了，现在进入下一个毫秒，重置Sequence
            this.sequence = 0;
        }

        // 如果系统时间发生了更改，而且更改到了一个过去的时间
        if (timestamp < this.lastTimestamp) {
            try {
                throw new Exception(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", this.lastTimestamp
                        - timestamp));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 保存上次的毫秒
        this.lastTimestamp = timestamp;

        // 毫秒数 ------> 机器ID ------> 毫秒内的Sequence
        long nextId = ((timestamp - twepoch << timestampLeftShift)) | (workerId << workerIdShift) | (this.sequence);
        return nextId;
    }

    private long tilNextMillis(final long lastTimestamp) {
        // 等待到下一个毫秒
        long timestamp = this.timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = this.timeGen();
        }
        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis();
    }


    public static void main(String[] args) {
        IdGenerator worker2 = new IdGenerator(2);
        System.out.println(worker2.nextId());
    }
}
