package com.github.chengzhx76.service.promotion.service.impl;

import com.github.chengzhx76.service.promotion.api.entity.Coupon;
import com.github.chengzhx76.service.promotion.api.entity.CouponCode;
import com.github.chengzhx76.service.promotion.api.service.CouponService;
import com.github.chengzhx76.service.promotion.dao.CouponCodeDaoMapper;
import com.github.chengzhx76.service.promotion.dao.CouponDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desc:
 * Author: hp
 * Date: 2016/11/7
 */
@RestController
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponCodeDaoMapper couponCodeDao;
    @Autowired
    private CouponDaoMapper couponDao;

    @Override
    public List<CouponCode> getCouponCodeByUser(String userId) {
        List<CouponCode> couponCodes = couponCodeDao.loadAll(new CouponCode(null, userId));
        for (CouponCode couponCode : couponCodes) {
            Coupon coupon = couponDao.load(new Coupon(couponCode.getId()));
            couponCode.setCoupon(coupon);
        }
        return couponCodes;
    }

    @Override
    public CouponCode getCouponById(String id) {
        CouponCode couponCode = couponCodeDao.load(new CouponCode(id, null));
        Coupon coupon = couponDao.load(new Coupon(couponCode.getId()));
        couponCode.setCoupon(coupon);
        return couponCode;
    }

    @Override
    public void updateCouponUsedById(String id) {
        CouponCode couponCode = new CouponCode();
        couponCode.setId(id);
        couponCode.setUsed(true);
        couponCode.preUpdate();
        couponCodeDao.update(couponCode);
    }
}
