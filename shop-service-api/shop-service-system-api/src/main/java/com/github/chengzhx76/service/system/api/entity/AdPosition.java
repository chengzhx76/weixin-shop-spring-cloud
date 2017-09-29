package com.github.chengzhx76.service.system.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 广告位置
 * Author: 光灿
 * Date: 2016/6/18
 */
public class AdPosition extends DataEntity<AdPosition> {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public AdPosition setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public AdPosition setType(String type) {
        this.type = type;
        return this;
    }
}
