package com.github.chengzhx76.service.user.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 关注商品
 * Author: cheng
 * Date: 2016/6/3
 */
public class ProductFocus extends DataEntity<ProductFocus> {
    private String accountId;
    private String productId;

    public ProductFocus() {
    }

    public ProductFocus(String accountId, String productId) {
        this.accountId = accountId;
        this.productId = productId;
    }

    //public ProductFocus(String accountId, String productId, Status status) {
    //    this.accountId = accountId;
    //    this.productId = productId;
    //    super.status = status;
    //}

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
