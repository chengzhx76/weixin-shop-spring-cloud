package com.github.chengzhx76.service.system.api.service;


import com.github.chengzhx76.service.system.api.entity.Ad;
import com.github.chengzhx76.service.system.api.entity.Notice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Desc: 广告
 * Author: cheng
 * Date: 2016/6/29
 */
@RequestMapping("/sys")
public interface SystemService {
    /**
     * 获取首页的图片
     * @return
     */
    @GetMapping("index/ad")
    List<Ad> getIndexAds();

    /**
     * 获取首页的公告
     * @return
     */
    @GetMapping("index/notices")
    List<Notice> getIndexNotices();

}
