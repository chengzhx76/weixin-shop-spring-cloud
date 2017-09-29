package com.github.chengzhx76.service.system.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc:系统参数
 * Author: 光灿
 * Date: 2016/6/17
 */
public class SystemParam extends DataEntity<SystemParam> {
    private String name;
    private String title;
    private String logo;
    private String description;
    private String copyright;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}
