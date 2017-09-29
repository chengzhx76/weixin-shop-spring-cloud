package com.github.chengzhx76.service.comment.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

import java.util.Date;

/**
 * Desc: 评论
 * Author: cheng
 * Date: 2016/6/17
 */
public class Comment extends DataEntity<Comment> {
    private String orderDetailId;
    private String productId;
    private String accountId;
    private String title;
    private String content;
    private int useful;
    private int useless;
    private String parentId;
    private double productScore;
    private double deliveryScore;
    private Date reviewTime;
    private int reviewStatus;
    private String reviewResult;

    public Comment() {
    }

    public Comment(String productId) {
        this.productId = productId;
    }

    public double getProductScore() {
        return productScore;
    }

    public Comment setProductScore(double productScore) {
        this.productScore = productScore;
        return this;
    }

    public double getDeliveryScore() {
        return deliveryScore;
    }

    public Comment setDeliveryScore(double deliveryScore) {
        this.deliveryScore = deliveryScore;
        return this;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUseful() {
        return useful;
    }

    public void setUseful(int useful) {
        this.useful = useful;
    }

    public int getUseless() {
        return useless;
    }

    public void setUseless(int useless) {
        this.useless = useless;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public int getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(int reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }
}
