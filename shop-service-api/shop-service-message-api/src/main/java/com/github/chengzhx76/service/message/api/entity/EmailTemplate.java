package com.github.chengzhx76.service.message.api.entity;


import com.github.chengzhx76.mq.enums.MsgType;
import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 邮件模板
 * Author: 光灿
 * Date: 2016/6/17
 */
public class EmailTemplate extends DataEntity<EmailTemplate> {
    private MsgType type;
    private String content;
    private boolean isEnable;

    public MsgType getType() {
        return type;
    }

    public void setType(MsgType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
