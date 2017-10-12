package com.github.chengzhx76.web.mobile.refactor;

import com.github.chengzhx76.service.system.api.service.SystemService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Desc:
 * Author: hp
 * Date: 2017/10/12
 */
@FeignClient("system-service")
public interface RefactorSystemService extends SystemService {
}
