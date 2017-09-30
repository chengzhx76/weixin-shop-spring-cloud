package com.github.chengzhx76.service.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Desc:
 * http://www.cnblogs.com/ityouknow/p/6120544.html
 * Author: hp
 * Date: 2017/9/30
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RabbitMQApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQApplication.class, args);
    }

}
