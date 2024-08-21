package com.kyan.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kyan27
 * @date 2024/08/21
 * User pojo类
 */
@Data
@TableName("seckill_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户 ID,手机号码
     * TableID注解用来指定主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(pass 明文+固定 salt)+salt)
     */
    private String password;

    private String salt;

    /**
     * 头像
     */
    private String head;

    /**
     * 注册时间
     */
    private Date registerDate;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginDate;

    /**
     * 登录次数
     */
    private Integer loginCount;
}
