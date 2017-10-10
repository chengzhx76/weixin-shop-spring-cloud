package com.github.chengzhx76.service.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/11
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.github.chengzhx76") // MQ扫描
@MapperScan("com.github.chengzhx76.service.message.dao")
public class MessageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageServiceApplication.class, args);
    }
}
