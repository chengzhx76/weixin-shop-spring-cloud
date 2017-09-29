package com.github.chengzhx76.service.product.dao;

import com.github.chengzhx76.service.product.api.entity.Picture;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 商品
 * Author: cheng
 * Date: 2016/6/28
 */
@Repository
public interface PictureDaoMapper extends BaseDaoMapper<Picture> {
    /**
     * 根据商品ID获取该商品所有图片
     * @param picture
     * @return
     */
    //List<Picture> loadAllPicture(Picture picture);

    /**
     * 根据商品ID获取默认的图片
     * @param picture
     * @return
     */
    //Picture loadDefaultPicture(Picture picture);

}
