package com.kyan.seckill.util;

import org.junit.jupiter.api.Test;

/**
 * @author Kyan27
 * @date 2024/08/19
 */
public class MD5UtilTest {

    @Test
    public void inputPassToMidPassTest() {
        String s = "123456";
        String midPass = MD5Util.inputPassToMidPass(s);
        System.out.println(midPass);
    }

    @Test
    public void inputPassToDBPassTest() {
        String s = "123456";
        String midPass = MD5Util.inputPassToMidPass(s);
        String dbPass = MD5Util.midPassToDBPass(midPass, "1a2b3c4d");
        System.out.println(dbPass);
        System.out.println(MD5Util.inputPassToDBPass(s, "1a2b3c4d"));
    }
}
