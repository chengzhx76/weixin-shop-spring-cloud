package com.github.chengzhx76.service.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/15
 */
@SpringBootApplication
@MapperScan("com.github.chengzhx76.service.user.dao")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
