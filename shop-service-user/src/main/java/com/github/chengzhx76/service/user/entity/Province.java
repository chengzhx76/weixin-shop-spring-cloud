package com.github.chengzhx76.service.user.entity;

import com.cheng.common.entity.DataEntity;

/**
 * Desc: 省份
 * Author: cheng
 * Date: 2016/6/3
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
