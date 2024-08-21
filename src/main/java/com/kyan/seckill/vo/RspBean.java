package com.kyan.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RspBean {

    private int code;
    private String message;
    private Object data;

    public static RspBean success(Object data) {
        return new RspBean(RspBeanEnum.SUCCESS.getCode(), RspBeanEnum.SUCCESS.getMessage(), data);
    }

    public static RspBean success() {
        return new RspBean(RspBeanEnum.SUCCESS.getCode(), RspBeanEnum.SUCCESS.getMessage(), null);
    }

    public static RspBean error(RspBeanEnum rspBeanEnum, Object data) {
        return new RspBean(rspBeanEnum.getCode(), rspBeanEnum.getMessage(), data);
    }

    public static RspBean error(RspBeanEnum rspBeanEnum) {
        return new RspBean(rspBeanEnum.getCode(), rspBeanEnum.getMessage(), null);
    }
}
