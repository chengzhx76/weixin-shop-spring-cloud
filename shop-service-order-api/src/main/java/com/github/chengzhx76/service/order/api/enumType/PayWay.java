package com.github.chengzhx76.service.order.api.enumType;

/**
 * Desc: 支付类型：在线，到付
 * Author: hp
 * Date: 2016/9/12
 */
public interface PayWay {
    /*ONLINE("在线"),
    OFFLINE("线下");

    private String name;

    PayWay(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    String ONLINE = "1";
    String OFFLINE = "2";
}
