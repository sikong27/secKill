package com.kyan.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyan.seckill.pojo.User;
import com.kyan.seckill.vo.LoginVo;
import com.kyan.seckill.vo.RspBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kyan27
 * @date 2024/08/22
 * IService中已声明了许多CRUD的方法
 */
public interface UserService extends IService<User> {

    //完成用户登录校验
    RspBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
}
