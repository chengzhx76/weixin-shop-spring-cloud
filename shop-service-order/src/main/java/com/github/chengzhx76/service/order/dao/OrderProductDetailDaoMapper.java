package com.github.chengzhx76.service.order.dao;

import com.github.chengzhx76.service.order.api.entity.OrderProductDetail;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc: 订单子项表-客服
 * Author: hp
 * Date: 2016/9/9
 */
@Repository
public interface OrderProductDetailDaoMapper extends BaseDaoMapper<OrderProductDetail> {
    /**
     * 获取该订单下的详情
     * @param orderDetail
     * @return
     */
    List<OrderProductDetail> loadByOrder(OrderProductDetail orderDetail);
}
