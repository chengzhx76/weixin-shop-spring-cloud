package com.github.chengzhx76.consumer.test.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTestApplication.class, args);
    }

}
