package com.kyan.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Kyan27
 * @date 2024/08/22
 * 响应枚举类
 */
@Getter
@ToString
@AllArgsConstructor
public enum RspBeanEnum {

    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务端异常"),
    LOGIN_ERROR(500210, "登录失败，账号或密码错误"),
    MOBILE_ERROR(500211, "手机号码格式错误"),
    MOBILE_NOT_EXIST(500212, "手机号码不存在"),
    ;

    private final Integer code;
    private final String message;

}
