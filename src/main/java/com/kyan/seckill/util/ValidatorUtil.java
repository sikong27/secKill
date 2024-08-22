package com.kyan.seckill.util;

import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

/**
 * @author Kyan27
 * @date 2024/08/22
 * 完成校验工作
 */
public class ValidatorUtil {

    //校验手机号
    private static final Pattern MOBILE_PATTERN = Pattern.compile("^1[3456789]\\d{9}$");

    public static boolean isMobile(String mobile){
        if (!StringUtils.hasText(mobile)){
            return false;
        }
        return MOBILE_PATTERN.matcher(mobile).matches();
    }
}
