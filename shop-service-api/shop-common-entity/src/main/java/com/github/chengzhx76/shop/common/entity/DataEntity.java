package com.github.chengzhx76.shop.common.entity;


import com.github.chengzhx76.shop.common.entity.enums.Status;
import com.github.chengzhx76.shop.common.entity.id.IdGen;
import com.github.chengzhx76.shop.common.util.StringUtils;

import java.util.Date;

/**
 * Desc: 数据Entity类
 * Author: 光灿
 * Date: 2016/2/27
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

    /** 备注 **/
    protected String remarks;
    /** 创建时间 **/
    protected Date createDate;
    /** 更新时间 **/
    protected Date updateDate;
    /** 状态 **/
    protected String status;

    public DataEntity() {
        super();
        this.status = Status.NORMAL;
    }

    /**
     * 更新之前需要手动调用
     */
    @Override
    public void preUpdate() {
        if (super.isUpdate) {
            this.updateDate = new Date();
        }
    }

    /**
     * 插入之前执行 需要手动调用
     */
    @Override
    public void preInsert() {
        if (isNewRecord) {
            setId(IdGen.uuid());
        }
        if (StringUtils.isBlank(getRemarks())) {
            setRemarks("--");
        }
        this.createDate = new Date();
        this.updateDate = new Date();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
