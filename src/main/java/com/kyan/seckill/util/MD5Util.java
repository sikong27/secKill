package com.kyan.seckill.util;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Kyan27
 * @date 2024/08/19
 * 工具类，提供加密方法
 */
public class MD5Util {

    /**
     * 返回加密后的字符串
     * @param src 需要加密的字符串
     * @return {@link String } MD5加密后的字符串
     */
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    //盐，后端写死
    private static final String SALT = "3I0LzeUmkf";

    /**
     * 第一次加盐加密
     * @param inputPass 用户输入的密码
     * @return {@link String } 中间密码
     */
    public static String inputPassToMidPass(String inputPass) {
        return md5(SALT.charAt(3) + inputPass + SALT + SALT.charAt(2));
    }

    /**
     * 第二次加盐加密，存储到数据库
     * @param midPass 中间密码
     * @param salt 盐，源自数据库查询
     * @return {@link String } 存储到数据库的密码
     */
    public static String midPassToDBPass(String midPass, String salt) {
        return md5(salt.charAt(2) + midPass + salt + salt.charAt(0));
    }

    public static String inputPassToDBPass(String inputPass, String salt) {
        String midPass = inputPassToMidPass(inputPass);
        return midPassToDBPass(midPass, salt);
    }


}
