package com.lizhi.bs.request.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * {@code @name} bs
 * {@code @description}
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/10 20:49
 */
@Data
public class UserAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @NotEmpty
    private String username;

    /**
     * 密码
     */
    @NotEmpty
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 权限：admin-图书馆管理员，reader-普通读者
     */
    private String role;

}
