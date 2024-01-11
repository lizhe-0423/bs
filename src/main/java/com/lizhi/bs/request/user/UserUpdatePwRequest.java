package com.lizhi.bs.request.user;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * {@code @name} bs
 * {@code @description}
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/11 10:25
 */
@Data
public class UserUpdatePwRequest implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空")
    private int userId;
    /**
     * 旧密码
     */
    @NotNull(message = "旧密码不能为空")
    private String oldPassword;
    /**
     * 新密码
     */
    @NotNull(message = "新密码不能为空")
    private String newPassword;

}
