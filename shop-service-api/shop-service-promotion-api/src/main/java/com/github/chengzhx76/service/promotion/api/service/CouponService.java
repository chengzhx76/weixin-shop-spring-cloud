package com.github.chengzhx76.service.promotion.api.service;


import com.github.chengzhx76.service.promotion.api.entity.CouponCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Desc:
 * Author: hp
 * Date: 2016/11/7
 */
@RequestMapping("coupon")
public interface CouponService {
    /**
     * 获取用户的优惠券
     * @param userId
     * @return
     */
    @GetMapping("user-id")
    List<CouponCode> getCouponCodeByUser(@RequestParam("userId") String userId);

    /**
     * 获取优惠券信息
     * @param id
     * @return
     */
    @GetMapping("id")
    CouponCode getCouponById(@RequestParam("id") String id);

    /**
     * 更新优惠券信息
     * @param id
     */
    @PutMapping("id")
    void updateCouponUsedById(@RequestParam("id") String id);
}
