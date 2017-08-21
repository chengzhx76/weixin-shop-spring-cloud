package com.github.chengzhx76.consumer.test.user;

import com.github.chengzhx76.service.user.api.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@RestController
public class UserController {

    @Autowired
    private RefactorUserService service;

//    @RequestMapping(value = "account/login-name/{loginName}", method = RequestMethod.GET)
    @GetMapping("account/login-name/{loginName}")
    public Account timeOutConsumer(@PathVariable String loginName) {
        return service.getAccountByLoginName(loginName);
    }

}
