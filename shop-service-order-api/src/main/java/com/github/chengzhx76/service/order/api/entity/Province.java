package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 省
 * Author: hp
 * Date: 2016/11/3
 */
public class Province extends DataEntity<Province> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
