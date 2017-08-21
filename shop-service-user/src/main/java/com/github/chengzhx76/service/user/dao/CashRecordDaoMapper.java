package com.github.chengzhx76.service.user.dao;

import com.github.chengzhx76.service.user.api.entity.CashRecord;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 用户基础信息
 * Author: cheng
 * Date: 2016/7/7
 */
@Repository
public interface CashRecordDaoMapper extends BaseDaoMapper<CashRecord> {
    /**
     * 获取最新的一条现金记录
     * @return
     */
    CashRecord loadNewByUser(CashRecord cashRecord);

}
