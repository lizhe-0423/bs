package com.lizhi.bs.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckRole;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.*;
import com.lizhi.bs.request.CommentRequest;
import com.lizhi.bs.response.CommentResponse;
import com.lizhi.bs.service.impl.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * {@code @name} bs
 * {@code @description} 用户功能
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/2 19:23
 */
@RestController
@RequestMapping("/user")
@Slf4j
@SaCheckLogin
@SaCheckRole("reader")
public class UserFuncController {
    private static final Logger logger = LoggerFactory.getLogger(UserFuncController.class);
    @Resource
    private BooksServiceImpl booksService;
    @Resource
    private BookRuleServiceImpl bookRuleService;
    @Resource
    private BorrowRecordsServiceImpl borrowRecordsService;
    @Resource
    private UsersServiceImpl usersService;
    @Resource
    private LibraryInfoServiceImpl libraryInfoService;
    @Resource
    private CommentServiceImpl commentService;
    @Resource
    private AiIntelligentServiceImpl aiIntelligentService;
    @Resource
    private ViolationServiceImpl violationService;


    /**
     * 搜索图书
     *
     * @param request 请求
     * @return BaseResponse<Page < Books>>
     */
    @RequestMapping("/searchBook")
    public BaseResponse<Page<Books>> searchBooks(@RequestBody BasePageRequest request) {
        return booksService.searchBooks(request);
    }

    /**
     * 获取规则列表
     *
     * @return BaseResponse<List < BookRule>>
     */
    @RequestMapping("/getRuleList")
    public BaseResponse<List<BookRule>> getRuleList() {
        return bookRuleService.getRuleList();
    }

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return BaseResponse<Users>
     */
    @GetMapping("getUserInfo/{userId}")
    public BaseResponse<Users> getUserInfoById(@PathVariable("userId") Integer userId) {
        return usersService.getUserInfoById(userId);
    }


    /**
     * 获取违章列表
     *
     * @param request BasePageRequest请求
     * @return BaseResponse<Page < Violation>>
     */
    @PostMapping("/getViolation")
    public BaseResponse<Page<Violation>> getViolation(@RequestBody BasePageRequest request) {
        return violationService.getViolation(request);
    }

    /**
     * 获取公告列表
     *
     * @return BaseResponse<List < LibraryInfo>>
     */
    @GetMapping("/getNoticeList")
    public BaseResponse<List<LibraryInfo>> getNoticeList() {
        return libraryInfoService.getNoticeList();
    }

    /**
     * 获取评论列表
     *
     * @return BaseResponse<List < CommentResponse>>
     */
    @GetMapping("/getCommentList")
    public BaseResponse<List<CommentResponse>> getCommentList() {
        return commentService.getCommentList();
    }

    /**
     * 添加评论
     *
     * @param request 请求
     * @return BaseResponse<String>
     */
    @PostMapping("/addComment")
    public BaseResponse<String> addComment(@RequestBody CommentRequest request) {
        return commentService.addComment(request);
    }

    /**
     * 调用AI模型，获取数据库中有的，并且推荐图书给用户
     *
     * @param request AiIntelligent请求
     * @return AI响应结果
     */
    @PostMapping("aiIntelligent")
    public BaseResponse<String> aiIntelligent(@RequestBody AiIntelligent request) {
        logger.info("controller层:aiIntelligent->request入参={}", request);
        return aiIntelligentService.aiIntelligent(request);
    }

    /**
     * 根据用户id获取AI模型推荐的图书
     *
     * @param userId 用户id
     * @return BaseResponse<List < AiIntelligent>>
     */
    @GetMapping("aiListInformation/{userId}")
    public BaseResponse<List<AiIntelligent>> getAiInformationByUserId(@PathVariable("userId") Long userId) {
        return aiIntelligentService.getAiInformationByUserId(userId);
    }

    /**
     * 根据用户id获取借阅记录
     *
     * @param request BasePageRequest请求
     * @return BaseResponse<Page < BorrowRecords>>
     */
    @PostMapping("/getBookBorrow")
    public BaseResponse<Page<BorrowRecords>> getBookBorrow(@RequestBody BasePageRequest request) {
        return borrowRecordsService.getBookBorrow(request);
    }

}
