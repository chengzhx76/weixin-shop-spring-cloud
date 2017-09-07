package com.github.chengzhx76.service.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/7
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RedisServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisServiceApplication.class, args);
    }

}
