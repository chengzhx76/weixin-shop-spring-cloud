package com.github.chengzhx76.service.user.dao;

import com.github.chengzhx76.service.user.api.entity.Account;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Desc: 用户基础信息
 * Author: cheng
 * Date: 2016/7/7
 */
@Mapper
public interface AccountDaoMapper extends BaseDaoMapper<Account> {
}
