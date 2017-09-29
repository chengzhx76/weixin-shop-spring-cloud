package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc:自提配送时间
 * Author: 光灿
 * Date: 2016/6/18
 */
public class ArayacakDeliveryTime extends DataEntity<ArayacakDeliveryTime> {
    private String name;

    public String getName() {
        return name;
    }

    public ArayacakDeliveryTime setName(String name) {
        this.name = name;
        return this;
    }
}
