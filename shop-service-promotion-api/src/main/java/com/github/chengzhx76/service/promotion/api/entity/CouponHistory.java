package com.github.chengzhx76.service.promotion.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

/**
 * Desc: 券记录
 * 含发券和用券两种记录
   行为或结果：存储发券时候的渠道和用券时候的单号
 * Date: 2016/6/17
 */
public class CouponHistory extends DataEntity<CouponHistory> {
    private String code;
    private String txBehavior;
    private String accountId;
    private String isSendUsed;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTxBehavior() {
        return txBehavior;
    }

    public void setTxBehavior(String txBehavior) {
        this.txBehavior = txBehavior;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getIsSendUsed() {
        return isSendUsed;
    }

    public void setIsSendUsed(String isSendUsed) {
        this.isSendUsed = isSendUsed;
    }
}
