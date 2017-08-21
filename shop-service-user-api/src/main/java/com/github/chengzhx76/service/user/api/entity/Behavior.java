package com.github.chengzhx76.service.user.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 该表主要为：积分记录、现金账户记录、券记录中的收入和支出服务。
 *      比如：原因录入：下订单    其附属信息为该动作产生的结果为：单号 200898983094
 * Author: cheng
 * Date: 2016/6/3
 */
@Deprecated
public class Behavior extends DataEntity<Behavior> {
    private String behaviorType;
    private String name;
    private String oid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getBehaviorType() {
        return behaviorType;
    }

    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
    }

}
