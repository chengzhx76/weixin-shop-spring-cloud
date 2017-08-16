package com.github.chengzhx76.shop.common.entity.enums;

/**
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public enum Status {
    NORMAL(1, "正常"),
    AUDIT(2, "审核"),
    LOCKED(3, "锁定"),
    DELETE(4, "删除"),
    ENABLE(5, "激活"),
    UNENABLE(5, "未激活");

    public int code;
    public String name;
    Status(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
