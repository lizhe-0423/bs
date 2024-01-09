package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 网站留言表
 * @TableName website_comments
 */
@TableName(value ="website_comments")
public class WebsiteComments implements Serializable {
    /**
     * 留言ID
     */
    @TableId(type = IdType.AUTO)
    private Integer commentId;

    /**
     * 用户ID，留言的用户
     */
    private Integer userId;

    /**
     * 留言内容
     */
    private String commentText;

    /**
     * 父留言ID，用于表示回复关系
     */
    private Integer parentCommentId;

    /**
     * 留言时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 留言ID
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * 留言ID
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 用户ID，留言的用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID，留言的用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 留言内容
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * 留言内容
     */
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    /**
     * 父留言ID，用于表示回复关系
     */
    public Integer getParentCommentId() {
        return parentCommentId;
    }

    /**
     * 父留言ID，用于表示回复关系
     */
    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    /**
     * 留言时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 留言时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WebsiteComments other = (WebsiteComments) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCommentText() == null ? other.getCommentText() == null : this.getCommentText().equals(other.getCommentText()))
            && (this.getParentCommentId() == null ? other.getParentCommentId() == null : this.getParentCommentId().equals(other.getParentCommentId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCommentText() == null) ? 0 : getCommentText().hashCode());
        result = prime * result + ((getParentCommentId() == null) ? 0 : getParentCommentId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", userId=").append(userId);
        sb.append(", commentText=").append(commentText);
        sb.append(", parentCommentId=").append(parentCommentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}