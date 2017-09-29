package com.github.chengzhx76.shop.common.entity.id;

import java.util.UUID;

/**
 * Desc: 封装各种生成唯一性ID算法的工具类
 * Author: 光灿
 * Date: 2016/2/27
 */
public class IdGen {

    //private static SecureRandom random = new SecureRandom();

    /**
     * 封装JDK自带的UUID，中间无-分割
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
