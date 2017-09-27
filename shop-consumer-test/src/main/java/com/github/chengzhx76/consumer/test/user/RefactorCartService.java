package com.github.chengzhx76.consumer.test.user;

import com.github.chengzhx76.service.cart.service.api.service.CartService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@FeignClient("cart-service") // 填写服务提供者的applicationName
public interface RefactorCartService extends CartService {
}
