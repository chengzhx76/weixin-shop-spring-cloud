package com.github.chengzhx76.service.comment.dao;

import com.github.chengzhx76.service.comment.api.entity.Comment;
import com.github.chengzhx76.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * Desc: 评论
 * Author: hp
 * Date: 2016/10/8
 */
@Repository
public interface CommentDaoMapper extends BaseDaoMapper<Comment> {
    /**
     * 获取商品的评论
     * @param comment
     * @return
     */
    //List<Comment> getByProductId(Comment comment);
}
