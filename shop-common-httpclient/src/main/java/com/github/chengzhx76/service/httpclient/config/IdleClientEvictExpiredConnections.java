package com.github.chengzhx76.service.httpclient.config;

import org.apache.http.conn.HttpClientConnectionManager;

/**
 * Desc: 关闭无效的连接
 * http://lxgandlz.cn/400.html
 * Author: Cheng
 * Date: 2016/4/13 0013
 */
public class IdleClientEvictExpiredConnections extends Thread {
    private final HttpClientConnectionManager connMgr;

    private volatile boolean shutdown;

    public IdleClientEvictExpiredConnections(HttpClientConnectionManager connMgr) {
        this.connMgr = connMgr;
        super.start();
    }

    @Override
    public void run() {
        try {
            while (!shutdown) {
                synchronized (this) {
                    wait(5000);
                    // 关闭失效的连接
                    connMgr.closeExpiredConnections();
                }
            }
        } catch (InterruptedException ex) {
            // 结束
        }
    }

    public void shutdown() {
        shutdown = true;
        synchronized (this) {
            notifyAll();
        }
    }

}
