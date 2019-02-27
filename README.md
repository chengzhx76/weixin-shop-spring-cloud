## 微信商城（weixin-shop）

weixin-shop是基于`Spring Cloud`微服务化电商平台，每个模块单独封装，如有某个模块不能满足业务，可以单独进行改造，无需关心其他模块功能，
各个模块之间通过Fegin调用，多业务系统并行开发，可以用来学习了解Spring Cloud各个组件的功能，了解电商的业务。
代码简洁，架构清晰，适合学习和直接项目中使用；核心技术采用Eureka、Fegin、Ribbon、Zuul、Hystrix、Security、Mybatis、Druid等主要框架和中间件，
前端[vue-shop](https://github.com/chengzhx76/vue-shop)采用Vue全家桶组件，欢迎Star。 

如果想了解Dubbo版本[Weixin-Dubbo](https://github.com/chengzhx76/Weixin-Dubbo)

欢迎大家star我的新项目[service-mpvue-mini](https://github.com/chengzhx76/service-mpvue-mini)每个后端程序员都要懂下前端 ^_^


## 项目结构
```
weixin-shop-spring-cloud
├─shop-common                   // 抽取的公共模块
├─shop-common-config            // 暂时没用，以后考虑用springCloud-config实现
├─shop-common-httpclient        // httpclient基础模块
├─shop-common-redis             // Redis基础模块
├─shop-common-service           // service、Dao基础模块
├─shop-consumer-test            // 消费者，主要用于测试下面的模块是否正常
├─shop-service-api              // 服务暴露的接口
│  ├─shop-common-entity         // 基础实体类
│  ├─shop-mq-model              // 消息中间件模块的Model
│  ├─shop-service-cart-api      // 购物车暴露的接口
│  ├─shop-service-comment-api   // 评论模块暴露的接口
│  ├─shop-service-message-api   // 消息模块暴露的接口
│  ├─shop-service-order-api     // 订单模块暴露的接口
│  ├─shop-service-product-api   // 商品模块暴露的接口
│  ├─shop-service-promotion-api // 促销模块暴露的接口
│  ├─shop-service-system-api    // 系统模块暴露的接口
│  └─shop-service-user-api      // 用户模块暴露的接口
├─shop-service-base             // 基础服务模块
│  └─shop-eureka-server         // 注册中心
├─shop-service-cart             // 购物车模块
├─shop-service-comment          // 评论模块
├─shop-service-message          // 消息模块
├─shop-service-order            // 订单模块
├─shop-service-product          // 商品模块
├─shop-service-promotion        // 促销模块
├─shop-service-rabbitmq         // 消息中间件模块
├─shop-service-system           // 系统模块
├─shop-service-user             // 用户模块
```

QQ群号：55088109

![image](https://github.com/chengzhx76/weixin-shop-spring-cloud/blob/master/resource/55088109.png)
