package com.github.chengzhx76.service.rabbitmq.service.impl;

import com.github.chengzhx76.service.mq.api.RabbitSmsService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import static com.github.chengzhx76.mq.constant.QueueName.*;

/**
 * Desc: 消息列队
 * Author: Cheng
 * Date: 2016/4/25 0025
 */
@RestController
public class RabbitSmsServiceImpl implements RabbitSmsService {
    @Autowired
    private RabbitTemplate rabbitSmsTemplate;

    @Override
    public void sendValidate(Object data) {
        rabbitSmsTemplate.convertAndSend(EXCHANGE, VALIDATE, data);
    }

    @Override
    public void sendCashNotify(Object data) {
        rabbitSmsTemplate.convertAndSend(EXCHANGE, NOTICE, data);
    }
}
