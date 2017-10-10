package com.github.chengzhx76.service.mq.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc: Rabbit接口
 * Author: Cheng
 * Date: 2016/4/25 0025
 */
@RequestMapping("log/sms")
public interface RabbitSmsService {

    /**
     * 发送注册短消息
     * @param msgData
     */
    @PostMapping("validate")
    void sendValidate(Object msgData);

    /**
     * 现金通知
     * @param msgData
     */
    @PostMapping("notify")
    void sendCashNotify(Object msgData);
}
