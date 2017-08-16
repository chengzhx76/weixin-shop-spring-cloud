package com.github.chengzhx76.service.user.controller;


import com.github.chengzhx76.service.user.entity.*;
import com.github.chengzhx76.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc: 用户
 * Author: cheng
 * Date: 2016/7/7
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据登陆账号获取该账号信息
     * @param loginName
     * @return
     */
    @GetMapping("account/login-name/{loginName}")
    public Account getAccountByLoginName(@PathVariable String loginName) {
        return userService.getAccountByLoginName(loginName);
    }

    /**
     * 根据ID获取帐户信息
     * @param id
     * @return
     */
    @GetMapping("account/{id}")
    public Account getAccountById(@PathVariable String id) {
        return userService.getAccountById(id);
    }

    /**
     * 保存帐号信息
     * @param account
     */
    @PostMapping("add/account")
    public void addAccess(@RequestBody Account account) {
        userService.saveAccess(account.getUsername(), account.getPassword(), account.getNickname(), account.getIp());
    }

    /**
     * 登陆验证
     * @param username
     * @param password
     * @param loginIp
     * @return
     */
    public String validateLogin(String username, String password, String loginIp) {
        return null;
    }

    /**
     * 获取默认的配送地址
     * @return
     */
    public DeliveryAddress getDefaultAddress(String userId) {

        return null;
    }
    /**
     * 获取默认的配送地址
     * @param id
     * @param userId
     * @return
     */
    public DeliveryAddress getDeliveryAddress(String id, String userId) {

        return null;
    }
    /**
     * 获取全部的配送信息
     * @param userId
     * @return
     */
    public List<DeliveryAddress> getAllDeliveryAddr(String userId) {

        return null;
    }
    /**
     * 获取用户账户信息
     * @param userId
     * @return
     */
    public Account getAccount(String userId){

        return null;
    }
    /**
     * 获取账户信息根据登录名
     * @param username
     * @return
     */
    public Account getAccountByUsername(String username) {

        return null;
    }
    /**
     * 更新帐户
     * @param account
     */
    public void updateAccount(Account account) {

    }
    /**
     * 保存动作
     * @param behavior
     */
    public void addBehavior(Behavior behavior) {

    }

    /**
     * 积分记录
     * @param userId
     */
    public BonusPointRecord getBonusPointRecord(String userId){

        return null;
    }

    /**
     * 获取当前月获取的积分记录
     * @param userId
     * @return
     */
    public List<BonusPointRecord> getByUSerIdAndCurrentMonth(String userId){

        return null;
    }

    /**
     * 保存积分
     * @param bonusPointRecord
     */
    public void addBonusPointRecord(BonusPointRecord bonusPointRecord) {

    }

    /**
     * 获取用户券记录
     * @param userId
     * @return
     */
    public CouponRecord getCouponRecordByUser(String userId) {

        return null;
    }

    /**
     * 保存券记录
     * @param couponRecor
     */
    public void addCouponRecord(CouponRecord couponRecor) {

    }

    /**
     * 根据用户获取最新的一条现金记录
     * @param userId
     * @return
     */
    public CashRecord getNewCashRecord(String userId) {

        return null;
    }

    /**
     * 保存现金记录
     * @param cashRecord
     */
    public void addCashRecord(CashRecord cashRecord) {

    }

    /**
     * 商品收藏
     * @param userId
     * @param productId
     */
    public void addProductFocus(String userId, String productId) {

    }
    /**
     * 删除商品收藏
     * @param userId
     * @param productId
     */
    public void deleteProductFocus(String userId, String productId){

    }
    /**
     * 该商品是否收藏
     * @param userId
     * @param productId
     * @return
     */
    public boolean isProductFocus(String userId, String productId){

        return false;
    }
    /**
     * 获取会员信息
     * @param userId
     * @return
     */
    public Member getMemberById(String userId){

        return null;
    }
    /**
     * 获取会员信息
     * @param userId
     * @return
     */
    public Member getMemberByAccountId(String userId){

        return null;
    }
    /**
     * 根据ID获取级别信息
     * @param id
     * @return
     */
    AccountLevel getAccountLevelById(String id){

        return null;
    }

    /**
     * 根据级别获取级别信息
     * @param level
     * @return
     */
    public AccountLevel getAccountLevelByLevel(int level){

        return null;
    }

}
