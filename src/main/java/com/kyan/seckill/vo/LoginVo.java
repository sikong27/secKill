package com.kyan.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kyan27
 * @date 2024/08/22
 * 接收用户登录发送的信息
 */
@Data
@AllArgsConstructor
public class LoginVo {
    private String mobile;
    private String password;
}
