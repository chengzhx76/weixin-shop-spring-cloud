## 微信商城

基于原来[Dubbo](https://github.com/chengzhx76/Weixin-Dubbo)项目改造成SpringCloud项目，欢迎Star

```
weixin-shop-spring-cloud
├─shop-common                   // 抽取的公共模块
├─shop-common-config            // 暂时没用，以后考虑用springCloud-config实现
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
├─shop-service-system           // 系统模块
├─shop-service-user             // 用户模块
```
