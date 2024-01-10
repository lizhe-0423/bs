package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.Comment;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.mapper.mp.CommentMapper;
import com.lizhi.bs.request.CommentRequest;
import com.lizhi.bs.response.CommentResponse;
import com.lizhi.bs.service.CommentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【comment】的数据库操作Service实现
 * @createDate 2024-01-04 17:18:11
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
        implements CommentService {

    private static final int LONG_INDEX=10;


    @Override
    public BaseResponse<List<CommentResponse>> getCommentList() {
        List<Comment> list = this.list();
        if (list.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "暂无弹幕");
        }
        ArrayList<CommentResponse> commentResponses = new ArrayList<>();
        for (Comment comment : list) {
            CommentResponse commentResponse = new CommentResponse();
            commentResponse.setId(comment.getCommentId());
            commentResponse.setAvatar(comment.getCommentAvatar());
            commentResponse.setMsg(comment.getCommentMessage());
            commentResponse.setTime(comment.getCommentTime());
            commentResponse.setBarrageStyle(comment.getCommentBarrageStyle());
            commentResponses.add(commentResponse);
        }
        return ResultUtils.success(commentResponses);
    }

    @Override
    public BaseResponse<String> addComment(CommentRequest request) {
        String[] barrageStyleArrays = {"yibai", "erbai", "sanbai", "sibai", "wubai", "liubai", "qibai", "babai", "jiubai", "yiqian"};
        Comment comment = new Comment();
        comment.setCommentId(null);
        comment.setCommentAvatar("https://img0.baidu.com/it/u=825023390,3429989944&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500");

        //格式化日期
        String format = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        comment.setCommentTime(Integer.parseInt(format));

        comment.setCommentMessage(request.getMsg());
        long index = Math.round(Math.random() * 10);

        //如果四舍五入后，下标越界，直接-1
        if (index == LONG_INDEX) {
            index = 9L;
        }
        String s = Long.toString(index);
        int newIndex = Integer.parseInt(s);
        comment.setCommentBarrageStyle(barrageStyleArrays[newIndex]);
        boolean flag = this.save(comment);

        if (!flag) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "添加弹幕失败");
        }
        return ResultUtils.success("添加弹幕成功");
    }
}




