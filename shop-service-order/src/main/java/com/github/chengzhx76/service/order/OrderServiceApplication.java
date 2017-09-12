package com.github.chengzhx76.service.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/11
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.github.chengzhx76.service.order.dao")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
