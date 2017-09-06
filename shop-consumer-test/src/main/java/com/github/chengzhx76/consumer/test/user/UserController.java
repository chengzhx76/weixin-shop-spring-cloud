package com.github.chengzhx76.consumer.test.user;

import com.github.chengzhx76.service.user.api.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@RestController
public class UserController {

    @Autowired
    private RefactorUserService service;

    @RequestMapping(value = "account/login-name/{loginName}", method = RequestMethod.GET)
    public Account getAccountByLoginName(@PathVariable String loginName) {
        return service.getAccountByLoginName(loginName);
    }

}
