package com.github.chengzhx76.mq.enums;

/**
 * Desc:
 * Author: 光灿
 * Date: 2016/11/20
 */
public enum MsgType {
    VALIDATE("验证码"),
    NOTICE_CASH_COMSUME("现金消费"),
    ACTIVITY("活动");

    private String name;
    MsgType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
