package com.github.chengzhx76.shop.common.util;

/**
 * Author: Cheng
 * Date: 2016/1/27 0027
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {
    /**
     * 隐藏手机号 中间六位
     * @param phone
     * @return
     */
    public static String hidePhone(String phone) {
        return substring(phone, 0, 3) + "******" + substring(phone, phone.length()-2, phone.length());
    }
}
