package com.github.chengzhx76.service.cart.service.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

import java.util.List;

/**
 * Desc: 购物车
 * Author: cheng
 * Date: 2016/6/6
 */
public class ShoppingCart extends DataEntity<ShoppingCart> {
    private String accessId;
    private int totalQuantity;

    private List<CartInfo> cartInfos;

    public String getAccessId() {
        return accessId;
    }

    public ShoppingCart setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public List<CartInfo> getCartInfos() {
        return cartInfos;
    }

    public void setCartInfos(List<CartInfo> cartInfos) {
        this.cartInfos = cartInfos;
    }
}
