package com.github.chengzhx76.mq.test;

import com.alibaba.fastjson.JSON;
import com.github.chengzhx76.mq.enums.MsgType;
import com.github.chengzhx76.mq.model.SmsModel;
import com.github.chengzhx76.service.mq.api.RabbitSmsService;
import com.github.chengzhx76.service.rabbitmq.RabbitMQApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMQApplication.class)
public class RabbitMQApplicationTests {
    @Autowired
    private RabbitSmsService smsService;

    @Test
    public void hello() throws Exception {
        SmsModel model = new SmsModel();
        model.setContent("hi, i am message 1");
        model.setDate(new Date());
        model.setPhone("18600536683");
        model.setType(MsgType.VALIDATE);
        model.setUserIp("127.0.0.1");

        System.out.println("=====> "+JSON.toJSONString(model));

        smsService.sendValidate(model);
    }

}
