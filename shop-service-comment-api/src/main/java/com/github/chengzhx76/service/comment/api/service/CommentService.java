package com.github.chengzhx76.service.comment.api.service;


import com.github.chengzhx76.service.comment.api.entity.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Desc: 评论
 * Author: hp
 * Date: 2016/10/8
 */
@RequestMapping("comment")
public interface CommentService {
    /**
     * 获取该商品的评论
     * @param productId
     * @return
     */
    @GetMapping("product-id")
    List<Comment> getByProductId(String productId);
}
