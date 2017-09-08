package com.github.chengzhx76.service.cart.service.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 购物车子
 * Author: cheng
 * Date: 2016/6/6
 */
public class CartInfo extends DataEntity<CartInfo> {
    private String accessId;
    private String productId;
    private int quantity;
    private boolean isChoose;

    public CartInfo() {
    }

    public CartInfo(String accessId, String productId, int quantity) {
        this.accessId = accessId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getAccessId() {
        return accessId;
    }

    public CartInfo setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }

    public String getProductId() {
        return productId;
    }

    public CartInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isChoose() {
        return isChoose;
    }

    public void setChoose(boolean choose) {
        isChoose = choose;
    }
}
