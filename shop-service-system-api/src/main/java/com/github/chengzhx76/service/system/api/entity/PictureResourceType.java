package com.github.chengzhx76.service.system.api.entity;

import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 图片资源类型：现在就首页的图片
 * Author: 光灿
 * Date: 2016/6/17
 */
@Deprecated
public class PictureResourceType extends DataEntity<PictureResourceType> {
    private String name;

    public String getName() {
        return name;
    }

    public PictureResourceType setName(String name) {
        this.name = name;
        return this;
    }
}
