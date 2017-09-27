package com.github.chengzhx76.service.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Desc: Redis 服务封装
 * Author: Cheng
 * Date: 2017/9/7 0014
 */
@Service
public class RedisService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;

//    public void setRedisTemplate(RedisTemplate<Serializable, Object> redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }

    /**
     * 批量删除对应的value
     * @param keys
     */
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    /**
     * 批量删除key
     * @param pattern
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0) {
            redisTemplate.delete(keys);
        }
    }

    /**
     * 删除对应的value
     * @param key
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 判断缓存中是否有对应的value
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 读取缓存
     * @param key
     * @return
     */
    public Object get(final String key) {
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        return operations.get(key);
    }

    /**
     * 写入缓存
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入缓存
     * @param key
     * @param value
     * @param expireTime
     * @return
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据Key刷新超时时间
     * @param key
     * @param expireTime
     * @return
     */
    public boolean flushExpireTime(final String key, Long expireTime) {
        boolean result = false;
        try {
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public Long increase(String key, String field) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        //redisTemplate.setKeySerializer(new StringRedisSerializer(StandardCharsets.UTF_8));
        //redisTemplate.setValueSerializer(new StringRedisSerializer());
        //redisTemplate.setHashKeySerializer(new StringRedisSerializer(StandardCharsets.UTF_8));
        redisTemplate.setHashValueSerializer(new GenericToStringSerializer(Long.class));
        if (exists(key, field)) {
            return hashOps.increment(field, 1L);
        } else {
            hashOps.putIfAbsent(field, 1);
            return 1L;
        }
    }

    public Long decrease(String key, String field) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        redisTemplate.setHashValueSerializer(new GenericToStringSerializer(Long.class));
        if (exists(key, field)) {
            long count = hashOps.increment(field, -1L);
            if (count == 0) {
                deleteField(key, field);
                return 0L;
            } else {
                return count;
            }
        }
        return 0L;
    }

    public void deleteField(String key, String field) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        hashOps.delete(field);
    }

    public void batchDeleteField(String key, String... field) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        hashOps.delete(field);
    }

    public Set<String> getFields(String key) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        return hashOps.keys();
    }

    public boolean exists(String key, String field) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        return hashOps.hasKey(field);
    }

    public Object getValueByKeyANdField(String key, String field) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        redisTemplate.setHashValueSerializer(new GenericToStringSerializer(Long.class));
        return hashOps.get(field);
    }

    public Map<Serializable, Object> getEntries(String key) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        //redisTemplate.setHashKeySerializer(new GenericToStringSerializer(String.class));
        redisTemplate.setHashValueSerializer(new GenericToStringSerializer(Long.class));
        return hashOps.entries();
    }

    public void put(String key, String field, Long value) {
        BoundHashOperations hashOps = redisTemplate.boundHashOps(key);
        redisTemplate.setHashValueSerializer(new GenericToStringSerializer(Long.class));
        hashOps.put(field, value);
    }
}
