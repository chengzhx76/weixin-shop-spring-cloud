package com.github.chengzhx76.service.system.api.service;


import com.github.chengzhx76.service.system.api.entity.Ad;
import com.github.chengzhx76.service.system.api.entity.Notice;

import java.util.List;

/**
 * Desc: 广告
 * Author: cheng
 * Date: 2016/6/29
 */
public interface SystemService {
    /**
     * 获取首页的图片
     * @return
     */
    List<Ad> getIndexAds();

    /**
     * 获取首页的公告
     * @return
     */
    List<Notice> getIndexNotices();

}
