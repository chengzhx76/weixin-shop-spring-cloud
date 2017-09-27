package com.github.chengzhx76.consumer.test.user;

import com.github.chengzhx76.service.user.api.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@RestController
@RequestMapping("test")
public class Controller {

    @Autowired
    private RefactorUserService userService;
    @Autowired
    private RefactorCartService cartService;

    @RequestMapping(value = "account/login-name/{loginName}", method = RequestMethod.GET)
    public Account getAccountByLoginName(@PathVariable String loginName) {
        return userService.getAccountByLoginName(loginName);
    }

    @RequestMapping(value = "cart/getproduct", method = RequestMethod.GET)
    public void testCart() {
        Set<String> data = cartService.getAllProductIds("1");
        System.out.println(data);
    }

}
