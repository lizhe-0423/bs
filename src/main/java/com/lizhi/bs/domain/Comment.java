package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName comment
 */
@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    private Integer commentId;

    private String commentAvatar;

    private String commentBarrageStyle;

    private String commentMessage;

    private Integer commentTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

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
        Comment other = (Comment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getCommentAvatar() == null ? other.getCommentAvatar() == null : this.getCommentAvatar().equals(other.getCommentAvatar()))
            && (this.getCommentBarrageStyle() == null ? other.getCommentBarrageStyle() == null : this.getCommentBarrageStyle().equals(other.getCommentBarrageStyle()))
            && (this.getCommentMessage() == null ? other.getCommentMessage() == null : this.getCommentMessage().equals(other.getCommentMessage()))
            && (this.getCommentTime() == null ? other.getCommentTime() == null : this.getCommentTime().equals(other.getCommentTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getCommentAvatar() == null) ? 0 : getCommentAvatar().hashCode());
        result = prime * result + ((getCommentBarrageStyle() == null) ? 0 : getCommentBarrageStyle().hashCode());
        result = prime * result + ((getCommentMessage() == null) ? 0 : getCommentMessage().hashCode());
        result = prime * result + ((getCommentTime() == null) ? 0 : getCommentTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", commentAvatar=").append(commentAvatar);
        sb.append(", commentBarrageStyle=").append(commentBarrageStyle);
        sb.append(", commentMessage=").append(commentMessage);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}