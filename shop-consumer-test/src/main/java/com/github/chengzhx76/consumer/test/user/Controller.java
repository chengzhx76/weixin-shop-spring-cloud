package com.github.chengzhx76.consumer.test.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@RestController
@RequestMapping("test")
public class Controller {

//    @Autowired
//    private RefactorUserService userService;

    @Autowired
    private RefactorRedisService redisService;

//    @RequestMapping(value = "account/login-name/{loginName}", method = RequestMethod.GET)
//    public Account getAccountByLoginName(@PathVariable String loginName) {
//        return userService.getAccountByLoginName(loginName);
//    }

    @RequestMapping(value = "exists/{token}", method = RequestMethod.GET)
    public Boolean getAccountByLoginName(@PathVariable String token) {
        return redisService.exists(token);
    }

}
