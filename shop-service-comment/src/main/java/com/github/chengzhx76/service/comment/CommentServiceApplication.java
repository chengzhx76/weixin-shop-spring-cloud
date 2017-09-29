package com.github.chengzhx76.service.comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Desc:
 * Author: hp
 * Date: 2017/9/29
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.github.chengzhx76.service.comment.dao")
public class CommentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentServiceApplication.class, args);
    }
}
