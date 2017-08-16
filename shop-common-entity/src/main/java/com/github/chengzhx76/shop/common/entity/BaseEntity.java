package com.github.chengzhx76.shop.common.entity;


import com.github.chengzhx76.shop.common.util.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * Desc: Entity 支持类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public abstract class BaseEntity<T> implements Serializable {

    private static final long serialVersionUID = 8560136559317259918L;
    /** 实体编号（唯一标识） **/
    protected String id;

    /** 是否是新记录（默认：true）， 调用setIsNewRecord()设置新记录，使用自定义ID。
     * 设置为false后强制执行插入语句，ID不会自动生成，需从手动传入。**/
    protected boolean isNewRecord = true;

    /**
     * 更新时是否要要执行preUpdate()方法
     */
    protected boolean isUpdate = true;

    /**
     * 插入前执行方法，子类实现
     */
    public abstract void preInsert();

    /**
     * 更新前执行方法，子类实现
     */
    public abstract void preUpdate();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /**
     * 是否是新记录（默认：true），调用setIsNewRecord()设置新记录，使用自定义ID。
     * 设置为false后强制执行插入语句，ID不会自动生成，需从手动传入。
     * @return
     */
    public boolean getIsNewRecord() {
        return isNewRecord || StringUtils.isBlank(getId());
    }

    /**
     * 是否是新记录（默认：true），调用setIsNewRecord()设置新记录，使用自定义ID。
     * 设置为false后强制执行插入语句，ID不会自动生成，需从手动传入。
     */
    public void setIsNewRecord(boolean isNewRecord) {
        this.isNewRecord = isNewRecord;
    }

    /**
     * 更新时是否要要执行preUpdate()方法
     */
    public boolean isUpdate() {
        return isUpdate;
    }

    public void setUpdate(boolean update) {
        isUpdate = update;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    @Override
    public boolean equals(Object obj) {
        //if (null == obj) {
        //    return false;
        //}
        //if (this == obj) {
        //    return true;
        //}
        //if (getClass().equals(obj.getClass())) {
        //    return false;
        //}
        //BaseEntity<T> that = (BaseEntity<T>) obj;
        //return null == this.getId() ? false : this.getId().equals(that.getId());
        return EqualsBuilder.reflectionEquals(this, obj);
    }


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
        //return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
