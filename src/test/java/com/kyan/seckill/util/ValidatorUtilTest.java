package com.kyan.seckill.util;

import org.junit.jupiter.api.Test;

public class ValidatorUtilTest {

    @Test
    public void isMobileTest() {
        System.out.println(ValidatorUtil.isMobile("12345678901"));
        System.out.println(ValidatorUtil.isMobile("15389371881"));
        System.out.println(ValidatorUtil.isMobile("25389371881"));
    }
}
