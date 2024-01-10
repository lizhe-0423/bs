package com.lizhi.bs.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckRole;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.BookType;
import com.lizhi.bs.request.user.UserAddRequest;
import com.lizhi.bs.service.impl.BookTypeServiceImpl;
import com.lizhi.bs.service.impl.UsersServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * {@code @name} bs
 * {@code @description}
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/10 15:28
 */
@RestController
@RequestMapping("/admin")
@Slf4j
@SaCheckLogin
@SaCheckRole("admin")
public class AdminFuncController {
    private static final Logger logger = LoggerFactory.getLogger(AdminFuncController.class);
    @Resource
    private BookTypeServiceImpl bookTypeService;
    @Resource
    private UsersServiceImpl usersService;

    /**
     * 查询书籍类型的列表 用于添加图书中回显分类
     *
     * @return R<BookType>
     */
    @GetMapping("/getType")
    public BaseResponse<List<BookType>> getBookTypeList() {
        logger.info("controller层:开始执行getBookTypeList方法");
        return bookTypeService.getBookTypeList();
    }

    /**
     * 添加图书用户
     *
     * @param request UserAddRequest请求
     * @return R<String>
     */
    @PostMapping("addBookUser")
    public BaseResponse<String> addBookUser(@Validated @RequestBody UserAddRequest request) {
        return usersService.addBookUser(request);
    }

}
