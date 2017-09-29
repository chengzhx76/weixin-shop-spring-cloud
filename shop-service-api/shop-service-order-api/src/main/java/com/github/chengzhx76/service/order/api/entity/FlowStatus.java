package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc:
 * Author: 光灿
 * Date: 2016/11/15
 */
public class FlowStatus extends DataEntity<FlowStatus> {
    private String name;
    private String preStatusId;
    private String nextStatusId;
    private String payWay;
    private int orderBy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreStatusId() {
        return preStatusId;
    }

    public void setPreStatusId(String preStatusId) {
        this.preStatusId = preStatusId;
    }

    public String getNextStatusId() {
        return nextStatusId;
    }

    public void setNextStatusId(String nextStatusId) {
        this.nextStatusId = nextStatusId;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }
}
