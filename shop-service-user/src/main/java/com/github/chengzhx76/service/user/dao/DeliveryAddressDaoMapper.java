package com.github.chengzhx76.service.user.dao;

import com.github.chengzhx76.service.user.api.entity.DeliveryAddress;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 配送地址
 * Author: cheng
 * Date: 2016/7/7
 */
@Repository
public interface DeliveryAddressDaoMapper extends BaseDaoMapper<DeliveryAddress> {
    /**
     * 获取默认的配送地址
     * @return
     */
    //DeliveryAddress loadDefaultAddress( DeliveryAddress address);
}
