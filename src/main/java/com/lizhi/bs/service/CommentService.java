package com.lizhi.bs.service;

import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhi.bs.request.CommentRequest;
import com.lizhi.bs.response.CommentResponse;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【comment】的数据库操作Service
* @createDate 2024-01-04 17:18:11
*/
public interface CommentService extends IService<Comment> {
    /**
     * 获取评论列表
     * @return BaseResponse<List<Comment>>
     */
    BaseResponse<List<CommentResponse>> getCommentList();

    /**
     * 添加评论
     * @param request CommentRequest
     * @return BaseResponse<String>
     */
    BaseResponse<String> addComment(CommentRequest request);
}
