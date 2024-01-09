package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 违章表
 *
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @TableName violation
 */
@TableName(value = "violation")
@Data
public class Violation implements Serializable {
    private Integer violationId;

    private Long usersId;

    private Integer bookId;

    private Date borrowDate;

    private Date closeDate;

    private Date returnDate;

    private String violationMessage;

    private Integer violationAdminId;

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
        Violation other = (Violation) that;
        return (this.getViolationId() == null ? other.getViolationId() == null : this.getViolationId().equals(other.getViolationId()))
                && (this.getUsersId() == null ? other.getUsersId() == null : this.getUsersId().equals(other.getUsersId()))
                && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
                && (this.getBorrowDate() == null ? other.getBorrowDate() == null : this.getBorrowDate().equals(other.getBorrowDate()))
                && (this.getCloseDate() == null ? other.getCloseDate() == null : this.getCloseDate().equals(other.getCloseDate()))
                && (this.getReturnDate() == null ? other.getReturnDate() == null : this.getReturnDate().equals(other.getReturnDate()))
                && (this.getViolationMessage() == null ? other.getViolationMessage() == null : this.getViolationMessage().equals(other.getViolationMessage()))
                && (this.getViolationAdminId() == null ? other.getViolationAdminId() == null : this.getViolationAdminId().equals(other.getViolationAdminId()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        result = prime * result + ((getUsersId() == null) ? 0 : getUsersId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getBorrowDate() == null) ? 0 : getBorrowDate().hashCode());
        result = prime * result + ((getCloseDate() == null) ? 0 : getCloseDate().hashCode());
        result = prime * result + ((getReturnDate() == null) ? 0 : getReturnDate().hashCode());
        result = prime * result + ((getViolationMessage() == null) ? 0 : getViolationMessage().hashCode());
        result = prime * result + ((getViolationAdminId() == null) ? 0 : getViolationAdminId().hashCode());
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
        sb.append(", violationId=").append(violationId);
        sb.append(", usersId=").append(usersId);
        sb.append(", bookId=").append(bookId);
        sb.append(", borrowDate=").append(borrowDate);
        sb.append(", closeDate=").append(closeDate);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", violationMessage=").append(violationMessage);
        sb.append(", violationAdminId=").append(violationAdminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}