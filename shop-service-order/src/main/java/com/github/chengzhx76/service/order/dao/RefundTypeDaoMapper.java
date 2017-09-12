package com.github.chengzhx76.service.order.dao;


import com.github.chengzhx76.service.order.api.entity.RefundType;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 退款方式：微信零钱
 * Author: hp
 * Date: 2016/9/9
 */
@Repository
public interface RefundTypeDaoMapper extends BaseDaoMapper<RefundType> {
}
