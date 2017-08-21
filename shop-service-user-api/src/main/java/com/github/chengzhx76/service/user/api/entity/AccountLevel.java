package com.github.chengzhx76.service.user.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 记录积分等级的规则
 *       积分等级与QQ上的星星月亮太阳升级规则一样，四个红蜜蜂可升级成一个黄蜜蜂，四个黄蜜蜂可升级成一个蓝蜜蜂
 * Author: cheng
 * Date: 2016/6/3
 */
public class AccountLevel extends DataEntity<AccountLevel> {
    private int accountId;
    private int level;
    private String name;
    private int needRonusPoint;
    private int nextLevelNeedPoint;
    @Deprecated
    private double reductPercent;
    private String consumeScale;
    private int freeFrequency;
    private Boolean isEnable;

    public AccountLevel() {
    }

    public AccountLevel(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getNeedRonusPoint() {
        return needRonusPoint;
    }

    public void setNeedRonusPoint(int needRonusPoint) {
        this.needRonusPoint = needRonusPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNextLevelNeedPoint() {
        return nextLevelNeedPoint;
    }

    public void setNextLevelNeedPoint(int nextLevelNeedPoint) {
        this.nextLevelNeedPoint = nextLevelNeedPoint;
    }

    public int getFreeFrequency() {
        return freeFrequency;
    }

    public void setFreeFrequency(int freeFrequency) {
        this.freeFrequency = freeFrequency;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    public String getConsumeScale() {
        return consumeScale;
    }

    public void setConsumeScale(String consumeScale) {
        this.consumeScale = consumeScale;
    }

    public double getReductPercent() {
        return reductPercent;
    }

    public void setReductPercent(double reductPercent) {
        this.reductPercent = reductPercent;
    }
}
