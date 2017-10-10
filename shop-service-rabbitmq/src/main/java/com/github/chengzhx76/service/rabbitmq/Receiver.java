package com.github.chengzhx76.service.rabbitmq;

import com.alibaba.fastjson.JSON;
import com.github.chengzhx76.mq.model.SmsModel;

/**
 * Desc:
 * Author: hp
 * Date: 2017/10/10
 */
//@Component
//@RabbitListener(queues = VALIDATE)
public class Receiver {

//    @RabbitListener(queues = VALIDATE)
//    @RabbitHandler
    public void process(SmsModel message) {
        System.out.println("Receiver : " + JSON.toJSONString(message));
    }
}
