package com.lizhi.bs.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.Users;
import com.lizhi.bs.request.LoginRequest;
import com.lizhi.bs.request.user.UserAddRequest;
import com.lizhi.bs.request.user.UserUpdatePwRequest;
import com.lizhi.bs.response.LoginResponse;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【users(用户表)】的数据库操作Service
 * @createDate 2024-01-02 09:46:25
 */
public interface UsersService extends IService<Users> {
    /**
     * 用户登录
     *
     * @param request request
     * @return Users
     */
    BaseResponse<LoginResponse> userLogin(LoginRequest request);

    /**
     * 管理员登录
     *
     * @param request request
     * @return Users
     */
    BaseResponse<LoginResponse> adminLogin(LoginRequest request);

    /**
     * 根据id获取用户信息
     *
     * @param id id
     * @return Users
     */
    BaseResponse<Users> getUserInfoById(Integer id);

    /**
     * 修改密码
     *
     * @param request 用户密码更新请求
     * @return String
     */
    BaseResponse<String> updatePassword(UserUpdatePwRequest request);

    /**
     * 获取用户数据
     *
     * @param users users
     * @return Users
     */
    BaseResponse<Users> getUserData(Users users);

    /**
     * 获取管理员数据
     *
     * @param users users
     * @return Users
     */
    BaseResponse<Users> getAdminData(Users users);

    /**
     * 修改用户信息
     *
     * @param users users
     * @return String
     */
    BaseResponse<String> updateUser(Users users);

    /**
     * 添加用户
     *
     * @param request request
     * @return String
     */
    BaseResponse<String> addBookUser(UserAddRequest request);

    /**
     * 获取用户列表
     *
     * @param request request
     * @return Users
     */
    BaseResponse<Page<Users>> getBookUserList(BasePageRequest request);
}
