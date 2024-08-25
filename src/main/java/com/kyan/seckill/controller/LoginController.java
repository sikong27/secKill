package com.kyan.seckill.controller;

import com.kyan.seckill.service.UserService;
import com.kyan.seckill.vo.LoginVo;
import com.kyan.seckill.vo.RspBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kyan27
 * @date 2024/08/22
 */
@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Resource
    private UserService userService;

    /**
     * @return {@link String }
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login"; //到templates/login.html页面
    }

    @RequestMapping("/doLogin")
    //返回json数据需要加这个注解，否则会认为去跳转到某个页面
    @ResponseBody
    public RspBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {
        //log.info("loginVo: {}", loginVo);
        return userService.doLogin(loginVo, request, response);
    }
}
