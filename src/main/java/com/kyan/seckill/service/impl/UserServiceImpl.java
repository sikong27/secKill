package com.kyan.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kyan.seckill.mapper.UserMapper;
import com.kyan.seckill.pojo.User;
import com.kyan.seckill.service.UserService;
import com.kyan.seckill.util.MD5Util;
import com.kyan.seckill.util.ValidatorUtil;
import com.kyan.seckill.vo.LoginVo;
import com.kyan.seckill.vo.RspBean;
import com.kyan.seckill.vo.RspBeanEnum;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kyan27
 * @date 2024/08/22
 * ServiceImpl已实现许多CRUD方法
 */
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public RspBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {
        //接收到mobile和midPwd
        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();
        //能不查数据库就不查数据库，故先校验输入是否合法
        if (!StringUtils.hasText(mobile) || !StringUtils.hasText(password)) {
            {
                return RspBean.error(RspBeanEnum.LOGIN_ERROR);
            }
        }
        if (!ValidatorUtil.isMobile(mobile)) {
            return RspBean.error(RspBeanEnum.MOBILE_ERROR);
        }
        //查询DB，查询用户是否存在
        User user = userMapper.selectById(mobile);
        if (user == null) {
            return RspBean.error(RspBeanEnum.LOGIN_ERROR);
        }
        //校验密码，loginVo中的密码是中间密码
        if (!MD5Util.midPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
            return RspBean.error(RspBeanEnum.LOGIN_ERROR);
        }
        return RspBean.success();
    }
}
