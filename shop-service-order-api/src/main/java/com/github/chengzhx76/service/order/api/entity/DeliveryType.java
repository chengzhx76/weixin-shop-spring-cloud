package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 配送方式：上门自提；第三方运输
 * Author: cheng
 * Date: 2016/6/6
 */
@Deprecated
public class DeliveryType extends DataEntity<DeliveryType> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
