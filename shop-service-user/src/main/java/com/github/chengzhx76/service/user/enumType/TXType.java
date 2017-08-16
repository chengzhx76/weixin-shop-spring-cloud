package com.github.chengzhx76.service.user.enumType;

/**
 * Desc:
 * Author: 光灿
 * Date: 2016/11/19
 */
public enum TXType {

    EARNING("收入"),
    EXPENSE("支出");

    private String name;
    TXType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
