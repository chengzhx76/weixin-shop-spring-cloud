package com.github.chengzhx76.web.mobile.dto;

/**
 * Desc:
 * Author: hp
 * Date: 2017/10/12
 */
public class SwiperDto {
    private String name;
    private String pictureUrl;
    private String linkUrl;

    public SwiperDto(String name, String pictureUrl, String linkUrl) {
        this.name = name;
        this.pictureUrl = pictureUrl;
        this.linkUrl = linkUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}
