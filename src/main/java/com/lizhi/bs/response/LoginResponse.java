package com.lizhi.bs.response;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

/**
 * {@code @name} bs
 * {@code @description} 登录返回信息
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/2 18:09
 */
@Data
public class LoginResponse {
    private static final long serialVersionUID = 1566564067165823413L;
    private int userId;
    private String userName;
    private String token;
}
