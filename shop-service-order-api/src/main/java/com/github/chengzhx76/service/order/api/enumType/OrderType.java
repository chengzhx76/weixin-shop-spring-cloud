package com.github.chengzhx76.service.order.api.enumType;

/**
 * Desc: 订单类型 正常-退货-返回换货
 * Author: cheng
 * Date: 2016/6/6
 */
public interface OrderType {
    /*NORMAL("正常"),
    RETURN("退货"),
    RETURN_EXCHANGE("返回换货");

    private String name;

    OrderType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/

    String NORMAL = "1";
    String RETURN = "2";
    String RETURN_EXCHANGE = "3";

}