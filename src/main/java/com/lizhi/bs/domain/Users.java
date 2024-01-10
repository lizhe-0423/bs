package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @TableName users
 */
@TableName(value = "users")
@Data
public class Users implements Serializable {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 图书馆规则ID
     */
    private Integer bookRuleId;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态：0-正常，1-禁用
     */
    private int status;

    /**
     * 权限：admin-图书馆管理员，reader-普通读者
     */
    private String role;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}