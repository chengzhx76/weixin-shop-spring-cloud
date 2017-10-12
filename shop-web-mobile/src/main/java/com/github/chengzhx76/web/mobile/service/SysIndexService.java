package com.github.chengzhx76.web.mobile.service;

import com.github.chengzhx76.service.system.api.entity.Ad;
import com.github.chengzhx76.service.system.api.entity.Notice;
import com.github.chengzhx76.web.mobile.dto.SwiperDto;
import com.github.chengzhx76.web.mobile.refactor.RefactorSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author: hp
 * Date: 2017/10/12
 */
@Service
public class SysIndexService {

    @Autowired
    private RefactorSystemService systemService;

    public List<SwiperDto> getSwiper() {
        List<Ad> ads = systemService.getIndexAds();
        List<SwiperDto> swipers = new ArrayList<>();
        for (Ad ad : ads) {
            swipers.add(new SwiperDto(ad.getName(), ad.getPictureUrl(), ad.getLinkUrl()));
        }
        return swipers;
    }

    public List<Notice> getNotices() {
        List<Notice> notices = systemService.getIndexNotices();
        return notices;
    }
}
