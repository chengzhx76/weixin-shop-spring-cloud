package com.github.chengzhx76.shop.common.security;

/**
 * Desc: 封装一些加密工具 密码的加密、验证
 * Author: 光灿
 * Date: 2016/7/9
 */
public class SecretUtils {
    /** Shiro 算法 **/
    public static final String HASH_ALGORITHM = "SHA-1";
    /** 盐值的大小 **/
    public static final int SALT_SIZE = 8;
    /** 迭代的次数 **/
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 生成密码，生成随机数的16为盐值并且经过1024次 SHA-1 Hash
     * @param plainPassword
     * @return
     */
    public static String entryptPassword(String plainPassword) {
        String plain = Encodes.unescapeHtml(plainPassword);
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, HASH_INTERATIONS);
        return Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword);
    }

    /**
     * @param planinPassword 明文密码
     * @param password 加密的密码
     * @return 验证结果
     */
    public static boolean validatePassword(String planinPassword, String password) {
        String plain = Encodes.unescapeHtml(planinPassword);
        byte[] salt = Encodes.decodeHex(password.substring(0, 16));
        byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, HASH_INTERATIONS);
        return password.equals(Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword));
    }
}
