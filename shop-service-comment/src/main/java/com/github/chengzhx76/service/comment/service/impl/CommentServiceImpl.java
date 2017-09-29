package com.github.chengzhx76.service.comment.service.impl;

import com.github.chengzhx76.service.comment.api.entity.Comment;
import com.github.chengzhx76.service.comment.api.service.CommentService;
import com.github.chengzhx76.service.comment.dao.CommentDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desc: 评论
 * Author: hp
 * Date: 2016/10/8
 */
@RestController
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDaoMapper commentDao;

    @Override
    public List<Comment> getByProductId(String productId) {
        return commentDao.loadAll(new Comment(productId));
    }
}
