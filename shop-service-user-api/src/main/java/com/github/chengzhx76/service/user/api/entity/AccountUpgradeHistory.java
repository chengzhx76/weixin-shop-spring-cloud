package com.github.chengzhx76.service.user.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 账户升级历史
 * Author: cheng
 * Date: 2016/6/3
 */
public class AccountUpgradeHistory extends DataEntity<AccountUpgradeHistory> {
    private int accountId;
    private int previousLevels;
    private int currentLevels;
    private int previousBonusPoint;
    private int currentBonusPoint;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getPreviousLevels() {
        return previousLevels;
    }

    public void setPreviousLevels(int previousLevels) {
        this.previousLevels = previousLevels;
    }

    public int getCurrentLevels() {
        return currentLevels;
    }

    public void setCurrentLevels(int currentLevels) {
        this.currentLevels = currentLevels;
    }

    public int getPreviousBonusPoint() {
        return previousBonusPoint;
    }

    public void setPreviousBonusPoint(int previousBonusPoint) {
        this.previousBonusPoint = previousBonusPoint;
    }

    public int getCurrentBonusPoint() {
        return currentBonusPoint;
    }

    public void setCurrentBonusPoint(int currentBonusPoint) {
        this.currentBonusPoint = currentBonusPoint;
    }
}
