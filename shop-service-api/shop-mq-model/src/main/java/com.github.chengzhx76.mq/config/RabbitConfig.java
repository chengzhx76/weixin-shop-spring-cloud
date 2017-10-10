package com.github.chengzhx76.mq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.chengzhx76.mq.constant.QueueName.*;

/**
 * Desc:
 * Author: hp
 * Date: 2017/10/10
 */
@Configuration
public class RabbitConfig {

    // 短信验证通知
    @Bean
    public Queue validate() {
        return new Queue(VALIDATE);
    }

    // 短信通知
    @Bean
    public Queue notice() {
        return new Queue(NOTICE);
    }

    // 促销通知
    @Bean
    public Queue activity() {
        return new Queue(ACTIVITY);
    }

    // 交换机
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingExchangeValidate(Queue validate, TopicExchange exchange) {
        return BindingBuilder.bind(validate).to(exchange).with(VALIDATE);
    }

    @Bean
    public Binding bindingExchangeNotice(Queue notice, TopicExchange exchange) {
        return BindingBuilder.bind(notice).to(exchange).with(NOTICE);
    }

    @Bean
    public Binding bindingExchangeActivity(Queue activity, TopicExchange exchange) {
        return BindingBuilder.bind(activity).to(exchange).with(ACTIVITY);
    }

}
