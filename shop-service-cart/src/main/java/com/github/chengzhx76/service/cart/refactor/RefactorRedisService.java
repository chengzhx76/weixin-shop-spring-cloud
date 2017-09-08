package com.github.chengzhx76.service.cart.refactor;

import com.github.chengzhx76.service.redis.api.service.RedisService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/7
 */
@FeignClient("redis-service")
public interface RefactorRedisService extends RedisService {
}
