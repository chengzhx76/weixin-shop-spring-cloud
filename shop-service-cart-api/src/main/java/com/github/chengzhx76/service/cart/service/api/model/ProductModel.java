package com.github.chengzhx76.service.cart.service.api.model;

import java.io.Serializable;

/**
 * Desc:
 * Author: 光灿
 * Date: 2016/9/15
 */
public class ProductModel implements Serializable {
    private String id;
    private int count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
