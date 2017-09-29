package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 退货原因
 * Author: cheng
 * Date: 2016/6/6
 */
public class ReturnReason extends DataEntity<ReturnReason> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
