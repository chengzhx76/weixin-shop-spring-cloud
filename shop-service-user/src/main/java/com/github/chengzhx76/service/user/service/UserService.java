package com.github.chengzhx76.service.user.service;


import com.github.chengzhx76.service.user.entity.*;

import java.util.List;

/**
 * Desc: 用户
 * Author: cheng
 * Date: 2016/7/7
 */
public interface UserService {
    /**
     * 根据登陆账号获取该账号信息
     * @param loginName
     * @return
     */
    Account getAccountByLoginName(String loginName);

    /**
     * 根据ID获取帐户信息
     * @param id
     * @return
     */
    Account getAccountById(String id);

    /**
     * 保存帐号信息
     * @param phone
     * @param password
     * @param nickname
     */
    void saveAccess(String phone, String password, String nickname, String ip);

    /**
     * 登陆验证
     * @param username
     * @param password
     * @param loginIp
     * @return
     */
    String validateLogin(String username, String password, String loginIp);

    /**
     * 获取默认的配送地址
     * @return
     */
    DeliveryAddress getDefaultAddress(String userId);
    /**
     * 获取默认的配送地址
     * @param id
     * @param userId
     * @return
     */
    DeliveryAddress getDeliveryAddress(String id, String userId);

    /**
     * 获取全部的配送信息
     * @param userId
     * @return
     */
    List<DeliveryAddress> getAllDeliveryAddr(String userId);

    /**
     * 获取用户账户信息
     * @param userId
     * @return
     */
    Account getAccount(String userId);

    /**
     * 获取账户信息根据登录名
     * @param username
     * @return
     */
    Account getAccountByUsername(String username);

    /**
     * 更新帐户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 保存动作
     * @param behavior
     */
    void addBehavior(Behavior behavior);

    /**
     * 积分记录
     * @param userId
     */
    BonusPointRecord getBonusPointRecord(String userId);

    /**
     * 获取当前月获取的积分记录
     * @param userId
     * @return
     */
    List<BonusPointRecord> getByUSerIdAndCurrentMonth(String userId);

    /**
     * 保存积分
     * @param bonusPointRecord
     */
    void addBonusPointRecord(BonusPointRecord bonusPointRecord);

    /**
     * 获取用户券记录
     * @param userId
     * @return
     */
    CouponRecord getCouponRecordByUser(String userId);

    /**
     * 保存券记录
     * @param couponRecor
     */
    void addCouponRecord(CouponRecord couponRecor);

    /**
     * 根据用户获取最新的一条现金记录
     * @param userId
     * @return
     */
    CashRecord getNewCashRecord(String userId);

    /**
     * 保存现金记录
     * @param cashRecord
     */
    void addCashRecord(CashRecord cashRecord);

    /**
     * 商品收藏
     * @param userId
     * @param productId
     */
    void addProductFocus(String userId, String productId);
    /**
     * 删除商品收藏
     * @param userId
     * @param productId
     */
    void deleteProductFocus(String userId, String productId);
    /**
     * 该商品是否收藏
     * @param userId
     * @param productId
     * @return
     */
    boolean isProductFocus(String userId, String productId);

    /**
     * 获取会员信息
     * @param userId
     * @return
     */
    Member getMemberById(String userId);
    /**
     * 获取会员信息
     * @param userId
     * @return
     */
    Member getMemberByAccountId(String userId);
    /**
     * 根据ID获取级别信息
     * @param id
     * @return
     */
    AccountLevel getAccountLevelById(String id);

    /**
     * 根据级别获取级别信息
     * @param level
     * @return
     */
    AccountLevel getAccountLevelByLevel(int level);

}
