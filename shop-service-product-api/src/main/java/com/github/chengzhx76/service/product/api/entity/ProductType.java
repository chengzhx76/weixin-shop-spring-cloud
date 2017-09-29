package com.github.chengzhx76.service.product.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 商品类型
 * Author: cheng
 * Date: 2016/6/6
 */
public class ProductType extends DataEntity<ProductType> {
    private String name;

    public ProductType() {}

    public ProductType(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
