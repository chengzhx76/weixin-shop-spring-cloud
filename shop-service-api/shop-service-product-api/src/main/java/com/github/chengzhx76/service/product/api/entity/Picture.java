package com.github.chengzhx76.service.product.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 图片
 * Author: cheng
 * Date: 2016/6/6
 */
public class Picture extends DataEntity<Picture> {
    private String productId;
    private String pictureUrl;
    private int width;
    private int height;
    private Boolean isDefault;

    public Picture() {}

    public Picture(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    public Picture(String productId, Boolean isDefault) {
        this.productId = productId;
        this.isDefault = isDefault;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Boolean isDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
