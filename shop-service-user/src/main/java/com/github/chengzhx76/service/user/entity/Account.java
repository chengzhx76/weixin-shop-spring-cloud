package com.github.chengzhx76.service.user.entity;

import com.github.chengzhx76.service.user.enumType.Credit;
import com.github.chengzhx76.service.user.enumType.SourceFrom;
import com.github.chengzhx76.shop.common.entity.DataEntity;

import java.math.BigDecimal;

/**
 * Desc: 账户表
 * Author: cheng
 * Date: 2016/6/3
 */
public class Account extends DataEntity<Account> {
    private String avatar;
    private String nickname;
    private String accountLevelId;
    private Credit credit;
    private String username;
    private String password;
    private int bonusPointUsable;
    private int bonusPointUpgrade;
    private BigDecimal balance;
    private boolean isEmployee;
    private String ip;
    private SourceFrom sourceFrom;

    public Account() {
    }

    public Account(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountLevelId() {
        return accountLevelId;
    }

    public void setAccountLevelId(String accountLevelId) {
        this.accountLevelId = accountLevelId;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public int getBonusPointUsable() {
        return bonusPointUsable;
    }

    public void setBonusPointUsable(int bonusPointUsable) {
        this.bonusPointUsable = bonusPointUsable;
    }

    public int getBonusPointUpgrade() {
        return bonusPointUpgrade;
    }

    public void setBonusPointUpgrade(int bonusPointUpgrade) {
        this.bonusPointUpgrade = bonusPointUpgrade;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public SourceFrom getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(SourceFrom sourceFrom) {
        this.sourceFrom = sourceFrom;
    }
}
