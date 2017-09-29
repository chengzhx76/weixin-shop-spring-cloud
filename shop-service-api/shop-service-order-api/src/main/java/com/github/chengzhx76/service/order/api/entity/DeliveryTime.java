package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 配送时间
 * Author: cheng
 * Date: 2016/6/6
 */
public class DeliveryTime extends DataEntity<DeliveryTime> {
    private String name;

    public DeliveryTime() {
    }

    public DeliveryTime(String id) {
        super.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}