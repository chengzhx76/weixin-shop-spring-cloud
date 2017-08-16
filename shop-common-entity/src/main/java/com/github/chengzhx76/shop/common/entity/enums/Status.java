package com.github.chengzhx76.shop.common.entity.enums;

/**
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface Status {
    /*NORMAL(1, "正常"),
    AUDIT(2, "审核"),
    LOCKED(3, "锁定"),
    DELETE(4, "删除"),
    ENABLE(5, "激活"),
    UNENABLE(6, "未激活");

    private int code;
    private String name;
    Status(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }*/

    String NORMAL = "1";
    String AUDIT = "2";
    String LOCKED = "3";
    String DELETE = "4";
    String ENABLE = "5";
    String UNENABLE = "6";

}
