package com.github.chengzhx76.service.system.dao;

import com.github.chengzhx76.service.system.api.entity.Ad;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc:
 * Author: cheng
 * Date: 2016/6/29
 */
@Repository
public interface AdDaoMapper extends BaseDaoMapper<Ad> {
    /**
     * 获取首页的广告图片
     * @return
     */
    List<Ad> loadIndexAds();

}
