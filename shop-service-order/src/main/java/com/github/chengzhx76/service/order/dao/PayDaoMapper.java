package com.github.chengzhx76.service.order.dao;

import com.github.chengzhx76.service.order.api.entity.Pay;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 支付方式：微信支付，支付宝支付，货到付款
 * Author: hp
 * Date: 2016/9/9
 */
@Repository
public interface PayDaoMapper extends BaseDaoMapper<Pay> {
}
