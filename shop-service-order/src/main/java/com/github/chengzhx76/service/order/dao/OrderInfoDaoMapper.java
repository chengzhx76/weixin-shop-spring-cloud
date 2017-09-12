package com.github.chengzhx76.service.order.dao;

import com.github.chengzhx76.service.order.api.entity.OrderInfo;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc: 订单
 * Author: hp
 * Date: 2016/9/9
 */
@Repository
public interface OrderInfoDaoMapper extends BaseDaoMapper<OrderInfo> {
    /**
     * 获取该用户订单
     * @param orderInfo
     * @return
     */
    List<OrderInfo> loadByUserIdOrderByCreateDate(OrderInfo orderInfo);

}
