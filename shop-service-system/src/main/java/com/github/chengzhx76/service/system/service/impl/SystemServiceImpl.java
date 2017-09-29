package com.github.chengzhx76.service.system.service.impl;

import com.github.chengzhx76.service.system.api.entity.Ad;
import com.github.chengzhx76.service.system.api.entity.Notice;
import com.github.chengzhx76.service.system.api.service.SystemService;
import com.github.chengzhx76.service.system.dao.AdDaoMapper;
import com.github.chengzhx76.service.system.dao.NoticeDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desc: 广告
 * Author: cheng
 * Date: 2016/6/29
 */
@RestController
public class SystemServiceImpl implements SystemService {
    @Autowired
    private AdDaoMapper adDao;
    @Autowired
    private NoticeDaoMapper noticeDao;
    /**
     * 获取首页的图片
     *
     * @return
     */
    @Override
    public List<Ad> getIndexAds() {
        return adDao.loadIndexAds();
    }

    /**
     * 获取首页的公告
     *
     * @return
     */
    @Override
    public List<Notice> getIndexNotices() {
        return noticeDao.loadAll();
    }
}
