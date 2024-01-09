package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName book_rule
 */
@TableName(value ="book_rule")
public class BookRule implements Serializable {
    /**
     * 借阅规则记录的唯一标识
     */
    @TableId(type = IdType.AUTO)
    private Integer ruleId;

    /**
     * 借阅规则编号
     */
    private Integer bookRuleId;

    /**
     * 借阅天数
     */
    private Integer bookDays;

    /**
     * 限制借阅的本数
     */
    private Integer bookLimitNumber;

    /**
     * 限制的图书馆
     */
    private String bookLimitLibrary;

    /**
     * 图书借阅后每天逾期费用
     */
    private Double bookOverdueFee;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 借阅规则记录的唯一标识
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * 借阅规则记录的唯一标识
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 借阅规则编号
     */
    public Integer getBookRuleId() {
        return bookRuleId;
    }

    /**
     * 借阅规则编号
     */
    public void setBookRuleId(Integer bookRuleId) {
        this.bookRuleId = bookRuleId;
    }

    /**
     * 借阅天数
     */
    public Integer getBookDays() {
        return bookDays;
    }

    /**
     * 借阅天数
     */
    public void setBookDays(Integer bookDays) {
        this.bookDays = bookDays;
    }

    /**
     * 限制借阅的本数
     */
    public Integer getBookLimitNumber() {
        return bookLimitNumber;
    }

    /**
     * 限制借阅的本数
     */
    public void setBookLimitNumber(Integer bookLimitNumber) {
        this.bookLimitNumber = bookLimitNumber;
    }

    /**
     * 限制的图书馆
     */
    public String getBookLimitLibrary() {
        return bookLimitLibrary;
    }

    /**
     * 限制的图书馆
     */
    public void setBookLimitLibrary(String bookLimitLibrary) {
        this.bookLimitLibrary = bookLimitLibrary;
    }

    /**
     * 图书借阅后每天逾期费用
     */
    public Double getBookOverdueFee() {
        return bookOverdueFee;
    }

    /**
     * 图书借阅后每天逾期费用
     */
    public void setBookOverdueFee(Double bookOverdueFee) {
        this.bookOverdueFee = bookOverdueFee;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        BookRule other = (BookRule) that;
        return (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()))
            && (this.getBookRuleId() == null ? other.getBookRuleId() == null : this.getBookRuleId().equals(other.getBookRuleId()))
            && (this.getBookDays() == null ? other.getBookDays() == null : this.getBookDays().equals(other.getBookDays()))
            && (this.getBookLimitNumber() == null ? other.getBookLimitNumber() == null : this.getBookLimitNumber().equals(other.getBookLimitNumber()))
            && (this.getBookLimitLibrary() == null ? other.getBookLimitLibrary() == null : this.getBookLimitLibrary().equals(other.getBookLimitLibrary()))
            && (this.getBookOverdueFee() == null ? other.getBookOverdueFee() == null : this.getBookOverdueFee().equals(other.getBookOverdueFee()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        result = prime * result + ((getBookRuleId() == null) ? 0 : getBookRuleId().hashCode());
        result = prime * result + ((getBookDays() == null) ? 0 : getBookDays().hashCode());
        result = prime * result + ((getBookLimitNumber() == null) ? 0 : getBookLimitNumber().hashCode());
        result = prime * result + ((getBookLimitLibrary() == null) ? 0 : getBookLimitLibrary().hashCode());
        result = prime * result + ((getBookOverdueFee() == null) ? 0 : getBookOverdueFee().hashCode());
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
        sb.append(", ruleId=").append(ruleId);
        sb.append(", bookRuleId=").append(bookRuleId);
        sb.append(", bookDays=").append(bookDays);
        sb.append(", bookLimitNumber=").append(bookLimitNumber);
        sb.append(", bookLimitLibrary=").append(bookLimitLibrary);
        sb.append(", bookOverdueFee=").append(bookOverdueFee);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}