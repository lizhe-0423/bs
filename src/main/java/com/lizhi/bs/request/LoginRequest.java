package com.lizhi.bs.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * {@code @name} bs
 * {@code @description} 登录请求
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/2 18:09
 */
@Data
public class LoginRequest implements Serializable {
    private static final long serialVersionUID = 1566564067165823413L;
    @NotEmpty
    private String username;
    @NotEmpty
    @Max(8)
    private String password;

}
