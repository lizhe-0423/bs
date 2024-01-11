package com.lizhi.bs.service.impl;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaLoginModel;
import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.Users;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.mapper.mp.UsersMapper;
import com.lizhi.bs.request.LoginRequest;
import com.lizhi.bs.request.user.UserAddRequest;
import com.lizhi.bs.request.user.UserUpdatePwRequest;
import com.lizhi.bs.response.LoginResponse;
import com.lizhi.bs.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.lizhi.bs.constants.LoginConstant.LOGIN_ADMIN_ROLE;
import static com.lizhi.bs.constants.LoginConstant.LOGIN_READER_ROLE;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【users(用户表)】的数据库操作Service实现
 * @createDate 2024-01-02 09:46:25
 */
@Service
@Slf4j
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService {

    private static final Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);

    @Override
    public BaseResponse<LoginResponse> userLogin(LoginRequest request) {
        Users users = getLoginInfo(request);
        if (users == null || !users.getRole().equals(LOGIN_READER_ROLE)) {
            logger.info("service层:user login failed, userAccount cannot match userPassword");
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "用户不存在或密码错误");
        }
        return getSaTokenLogin(users);
    }

    @Override
    public BaseResponse<LoginResponse> adminLogin(LoginRequest request) {
        Users users = getLoginInfo(request);
        if (users == null || !users.getRole().equals(LOGIN_ADMIN_ROLE)) {
            logger.info("service层:user login failed, adminAccount cannot match userPassword");
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "管理员不存在或管理员密码错误");
        }
        return getSaTokenLogin(users);
    }

    /**
     * 获取Sa-Token登录信息
     *
     * @param users 用户信息
     * @return Sa-Token登录信息
     */
    @NotNull
    private BaseResponse<LoginResponse> getSaTokenLogin(Users users) {
        StpUtil.login(users.getUserId(), new SaLoginModel().setTimeout(60 * 60 * 24 * 7L));
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUserId(users.getUserId());
        loginResponse.setUserName(users.getUsername());
        loginResponse.setToken(StpUtil.getTokenValue());
        return ResultUtils.success(loginResponse);
    }

    /**
     * 校验用户登录信息
     *
     * @param request 用户登录信息
     * @return 登录的用户信息
     */
    private Users getLoginInfo(LoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();
        LambdaQueryWrapper<Users> usersLambdaQueryWrapper = new LambdaQueryWrapper<>();
        usersLambdaQueryWrapper.eq(Users::getUsername, username);
        usersLambdaQueryWrapper.eq(Users::getPassword, SaSecureUtil.sha256(password));
        return this.baseMapper.selectOne(usersLambdaQueryWrapper);
    }

    @Override
    public BaseResponse<Users> getUserInfoById(Integer id) {
        Users byId = this.getById(id);
        if (byId == null) {
            logger.info("service层:getUserInfoById->id={}userInfo={null}", id);
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "byId=null");
        } else {
            return ResultUtils.success(byId);
        }
    }

    @Override
    public BaseResponse<String> updatePassword(UserUpdatePwRequest request) {

        Users byId = this.getById(request.getUserId());
        if(byId.getPassword().equals(request.getOldPassword())){
            Users toUsers = new Users();
            toUsers.setUserId(request.getUserId());
            toUsers.setPassword(SaSecureUtil.sha256(request.getNewPassword()));
            if (this.updateById(toUsers)) {
                return ResultUtils.success("修改密码成功");
            }
        }else {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "修改密码失败");
        }
        return null;
    }

    @Override
    public BaseResponse<Users> getUserData(Users users) {
        LambdaQueryWrapper<Users> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Users::getUserId, users.getUserId());
        Users userOne = this.getOne(queryWrapper);
        if (userOne == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "用户不存在");
        }
        return ResultUtils.success(userOne);
    }

    @Override
    public BaseResponse<Users> getAdminData(Users users) {
        LambdaQueryWrapper<Users> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Users::getUserId, users.getUserId());
        Users userOne = this.getOne(queryWrapper);
        if (userOne == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "管理员不存在");
        }
        return ResultUtils.success(userOne);
    }

    @Override
    public BaseResponse<String> updateUser(Users users) {
        return null;
    }

    @Override
    public BaseResponse<String> addBookUser(UserAddRequest request) {
        logger.info("用户id{}service层:执行addBookUser()方法 request={}", StpUtil.getLoginId(), request);
        Users users = new Users();
        users.setUsername(request.getUsername());
        String encryptPassword = SaSecureUtil.sha256(request.getPassword());
        users.setPassword(encryptPassword);
        users.setRole(LOGIN_READER_ROLE);
        users.setBookRuleId(1);
        users.setEmail(request.getEmail());
        users.setStatus(0);
        if (this.save(users)) {
            return ResultUtils.success("添加用户成功");
        } else {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "添加用户失败");
        }
    }
}




