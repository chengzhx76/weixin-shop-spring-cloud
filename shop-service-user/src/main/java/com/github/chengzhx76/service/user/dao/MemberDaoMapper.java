package com.github.chengzhx76.service.user.dao;

import com.github.chengzhx76.service.user.api.entity.Member;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 用户基础信息
 * Author: cheng
 * Date: 2016/7/7
 */
@Repository
public interface MemberDaoMapper extends BaseDaoMapper<Member> {
}
