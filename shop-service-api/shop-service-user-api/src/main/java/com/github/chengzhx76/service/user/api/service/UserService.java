package com.github.chengzhx76.service.user.api.service;


import com.github.chengzhx76.service.user.api.entity.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc: 用户
 * Author: cheng
 * Date: 2016/7/7
 */
@RequestMapping("/user")
public interface UserService {
    /**
     * 根据登陆账号获取该账号信息
     * @param loginName
     * @return
     */
    @GetMapping("account/login-name")
    Account getAccountByLoginName(@RequestParam("loginName") String loginName);

    /**
     * 根据ID获取帐户信息
     * @param id
     * @return
     */
    @GetMapping("account/id")
    Account getAccountById(@RequestParam("id") String id);

    /**
     * 保存帐号信息
     * @param phone
     * @param password
     * @param nickname
     */
    @PostMapping("account")
    void saveAccess(@RequestParam("phone") String phone, @RequestParam("password") String password, @RequestParam("nickname") String nickname, @RequestParam("ip") String ip);

    /**
     * 登陆验证
     * @param username
     * @param password
     * @param loginIp
     * @return
     */
    @GetMapping("validate-login")
    String validateLogin(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("loginIp") String loginIp);

    /**
     * 获取默认的配送地址
     * @return
     */
    @GetMapping("default-addr")
    DeliveryAddress getDefaultAddress(@RequestParam("userId") String userId);
    /**
     * 获取默认的配送地址
     * @param id
     * @param userId
     * @return
     */
    @GetMapping("delivery-addr")
    DeliveryAddress getDeliveryAddress(@RequestParam("id") String id, @RequestParam("userId") String userId);

    /**
     * 获取全部的配送信息
     * @param userId
     * @return
     */
    @GetMapping("all-delivery-addr")
    List<DeliveryAddress> getAllDeliveryAddr(@RequestParam("userId") String userId);

    /**
     * 获取用户账户信息
     * @param userId
     * @return
     */
    @GetMapping("account/user-id")
    Account getAccount(@RequestParam("userId") String userId);

    /**
     * 获取账户信息根据登录名
     * @param username
     * @return
     */
    @GetMapping("account/user-name")
    Account getAccountByUsername(@RequestParam("username") String username);

    /**
     * 更新帐户
     * @param account
     */
    @PutMapping("account")
    void updateAccount(Account account);

    /**
     * 保存动作
     * @param behavior
     */
    @PostMapping("behavior")
    void addBehavior(Behavior behavior);

    /**
     * 积分记录
     * @param userId
     */
    @GetMapping("bonus-point-record")
    BonusPointRecord getBonusPointRecord(@RequestParam("username") String userId);

    /**
     * 获取当前月获取的积分记录
     * @param userId
     * @return
     */
    @GetMapping("bonus-point-records/user-id")
    List<BonusPointRecord> getByUserIdAndCurrentMonth(@RequestParam("username") String userId);

    /**
     * 保存积分
     * @param bonusPointRecord
     */
    @PostMapping("bonus-point-record")
    void addBonusPointRecord(BonusPointRecord bonusPointRecord);

    /**
     * 获取用户券记录
     * @param userId
     * @return
     */
    @GetMapping("coupon-record/user-id")
    CouponRecord getCouponRecordByUser(@RequestParam("username") String userId);

    /**
     * 保存券记录
     * @param couponRecor
     */
    @PostMapping("coupon-recor")
    void addCouponRecord(CouponRecord couponRecor);

    /**
     * 根据用户获取最新的一条现金记录
     * @param userId
     * @return
     */
    @GetMapping("new-cash-record/user-id")
    CashRecord getNewCashRecord(@RequestParam("username") String userId);

    /**
     * 保存现金记录
     * @param cashRecord
     */
    @PostMapping("add/cash-record")
    void addCashRecord(CashRecord cashRecord);

    /**
     * 商品收藏
     * @param userId
     * @param productId
     */
    @PostMapping("add/product-focus")
    void addProductFocus(@RequestParam("userId") String userId, @RequestParam("productId") String productId);
    /**
     * 删除商品收藏
     * @param userId
     * @param productId
     */
    @PostMapping("delete/product-focus/user-id/product-id")
    void deleteProductFocus(@RequestParam("userId") String userId, @RequestParam("productId") String productId);
    /**
     * 该商品是否收藏
     * @param userId
     * @param productId
     * @return
     */
    @GetMapping("is-focus/user-id/product-id")
    boolean isProductFocus(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 获取会员信息
     * @param userId
     * @return
     */
    @GetMapping("member/user-id")
    Member getMemberById(@RequestParam("userId") String userId);
    /**
     * 获取会员信息
     * @param userId
     * @return
     */
    @GetMapping("member/account-id")
    Member getMemberByAccountId(@RequestParam("userId") String userId);
    /**
     * 根据ID获取级别信息
     * @param id
     * @return
     */
    @GetMapping("account-level/id")
    AccountLevel getAccountLevelById(@RequestParam("id") String id);

    /**
     * 根据级别获取级别信息
     * @param level
     * @return
     */
    @GetMapping("account-level/level")
    AccountLevel getAccountLevelByLevel(@RequestParam("level") int level);

}
