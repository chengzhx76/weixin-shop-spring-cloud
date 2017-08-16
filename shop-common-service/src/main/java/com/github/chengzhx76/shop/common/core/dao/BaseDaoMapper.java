package com.github.chengzhx76.shop.common.core.dao;

import java.util.List;

/**
 * Desc: Dao基类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface BaseDaoMapper<T> {
    /**
     * 获取单条数据
     * @param entity
     * @return
     */
    T load(T entity);
    /**
     * 获取所有的数据
     * @return
     */
    List<T> loadAll();
    /**
     * 根据条件获取List的数据
     * @return
     */
    List<T> loadAll(T entity);
    /**
     * 保存实体
     * @param entity
     * @return
     */
    int save(T entity);
    /**
     * 保存实体
     * @param entities
     * @return
     */
    int saves(List<T> entities);
    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据（一般为逻辑删除）
     * @param entity
     * @return
     */
    int delete(T entity);
}
