package com.github.chengzhx76.service.system.api.entity;

import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 通知
 * Author: 光灿
 * Date: 2016/6/18
 */
public class Notice extends DataEntity<Notice> {
    private String title;
    private String content;
    private String linkUrl;
    //private String noticeTypeId;

    public String getTitle() {
        return title;
    }

    public Notice setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Notice setContent(String content) {
        this.content = content;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}
