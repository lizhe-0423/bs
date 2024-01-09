package com.lizhi.bs.controller;

import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.request.LoginRequest;
import com.lizhi.bs.response.LoginResponse;
import com.lizhi.bs.service.impl.UsersServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * {@code @name} bs
 * {@code @description}
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/8 14:03
 */
@RestController
@RequestMapping("/admin")
@MapperScan("com.lizhi.bs.mapper")
@Slf4j
public class AdminLoginController {
    @Resource
    private UsersServiceImpl usersService;
    /**
     * 登录
     * @param request 登录请求
     * @return BaseResponse<LoginResponse>
     */
    @PostMapping("/login")
    public BaseResponse<LoginResponse> login(@RequestBody LoginRequest request) {
        log.info("controller:LoginRequest={}",request);
        return usersService.adminLogin(request);
    }
}
