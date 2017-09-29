package com.github.chengzhx76.service.order.api.enumType;

/**
 * Desc: 派送状态
 * Author: hp
 * Date: 2016/11/10
 */
@Deprecated
public enum FlowStatus {
    COD("货到付款"),
    UNPAID("未付款"),
    PAID("已付款"),
    PICKING("拣货中"),
    DISTRIBUTION("配送中"),
    DELIVER("派件中"),
    DELIVERED("已送达");

    private String name;
    FlowStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

