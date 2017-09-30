package com.github.chengzhx76.service.message.dao;

import com.github.chengzhx76.service.message.api.entity.SmsTemplate;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 短信模板
 * Author: 光灿
 * Date: 2016/7/10
 */
@Repository
public interface SmsTemplateDaoMapper extends BaseDaoMapper<SmsTemplate> {
    /**
     * 获取正在使用的模板
     * @return
     */
    SmsTemplate loadRegTemp();

}
