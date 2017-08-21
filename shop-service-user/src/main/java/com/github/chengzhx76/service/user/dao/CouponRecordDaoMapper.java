package com.github.chengzhx76.service.user.dao;

import com.github.chengzhx76.service.user.api.entity.CouponRecord;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 记录券的收支情况
 * Author: cheng
 * Date: 2016/7/7
 */
@Repository
public interface CouponRecordDaoMapper extends BaseDaoMapper<CouponRecord> {
    /**
     * 根据用户获取券记录
     * @param couponRecord
     * @return
     */
    CouponRecord loadByUser(CouponRecord couponRecord);

}
