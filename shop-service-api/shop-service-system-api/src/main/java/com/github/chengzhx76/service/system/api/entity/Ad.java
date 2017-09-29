package com.github.chengzhx76.service.system.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 广告资源
 * Author: 光灿
 * Date: 2016/6/18
 */
public class Ad extends DataEntity<Ad> {
    private String name;
    private String pictureUrl;
    private String linkUrl;
    private int width;
    private int height;
    private int priority;
    private boolean isEnable;

    public String getName() {
        return name;
    }

    public Ad setName(String name) {
        this.name = name;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public Ad setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public Ad setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Ad setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Ad setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getPriority() {
        return priority;
    }

    public Ad setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public Ad setEnable(boolean enable) {
        isEnable = enable;
        return this;
    }
}
