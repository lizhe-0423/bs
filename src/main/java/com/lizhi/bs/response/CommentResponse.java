package com.lizhi.bs.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qit 李哲
 */
@Data
public class CommentResponse implements Serializable {
    /**
     * 评论id
     */
    private Integer id;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 评论内容
     */
    private String msg;
    /**
     * 评论时间
     */
    private Integer time;
    /**
     * 弹幕样式
     */
    private String barrageStyle;

    private static final long serialVersionUID = 1L;
}
