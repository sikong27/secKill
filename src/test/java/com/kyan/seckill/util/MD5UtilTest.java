package com.kyan.seckill.util;

import org.junit.jupiter.api.Test;

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
        System.out.println(midPass);
        String dbPass = MD5Util.midPassToDBPass(midPass, "0XnBM0iG");
        System.out.println(dbPass);
        System.out.println(MD5Util.inputPassToDBPass(s, "0XnBM0iG"));
    }
}
