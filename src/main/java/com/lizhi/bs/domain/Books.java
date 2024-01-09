package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 图书表
 *
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @TableName books
 */
@TableName(value = "books")
public class Books implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer bookId;

    /**
     * 图书编号 图书的唯一标识
     */
    private Long bookNumber;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 图书作者
     */
    private String bookAuthor;

    /**
     * 图书类别
     */
    private String bookType;

    /**
     * 图书位置
     */
    private String bookLocation;

    /**
     * 0-未启用 1-正常
     */
    private Integer bookStatus;

    /**
     * 图书描述
     */
    private String bookDescription;

    /**
     * 图书图片
     */
    private String bookPhoto;

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
     * 主键
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 主键
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 图书编号 图书的唯一标识
     */
    public Long getBookNumber() {
        return bookNumber;
    }

    /**
     * 图书编号 图书的唯一标识
     */
    public void setBookNumber(Long bookNumber) {
        this.bookNumber = bookNumber;
    }

    /**
     * 图书名称
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 图书名称
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 图书作者
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * 图书作者
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * 图书类别
     */
    public String getBookType() {
        return bookType;
    }

    /**
     * 图书类别
     */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    /**
     * 图书位置
     */
    public String getBookLocation() {
        return bookLocation;
    }

    /**
     * 图书位置
     */
    public void setBookLocation(String bookLocation) {
        this.bookLocation = bookLocation;
    }

    /**
     * 0-未启用 1-正常
     */
    public Integer getBookStatus() {
        return bookStatus;
    }

    /**
     * 0-未启用 1-正常
     */
    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    /**
     * 图书描述
     */
    public String getBookDescription() {
        return bookDescription;
    }

    /**
     * 图书描述
     */
    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
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

    public String getBookPhoto() {
        return bookPhoto;
    }

    public void setBookPhoto(String bookPhoto) {
        this.bookPhoto = bookPhoto;
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
        Books other = (Books) that;
        return (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
                && (this.getBookNumber() == null ? other.getBookNumber() == null : this.getBookNumber().equals(other.getBookNumber()))
                && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
                && (this.getBookAuthor() == null ? other.getBookAuthor() == null : this.getBookAuthor().equals(other.getBookAuthor()))
                && (this.getBookType() == null ? other.getBookType() == null : this.getBookType().equals(other.getBookType()))
                && (this.getBookLocation() == null ? other.getBookLocation() == null : this.getBookLocation().equals(other.getBookLocation()))
                && (this.getBookStatus() == null ? other.getBookStatus() == null : this.getBookStatus().equals(other.getBookStatus()))
                && (this.getBookDescription() == null ? other.getBookDescription() == null : this.getBookDescription().equals(other.getBookDescription()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getBookPhoto() == null ? other.getBookPhoto() == null : this.getBookPhoto().equals(other.getBookPhoto()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getBookNumber() == null) ? 0 : getBookNumber().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookAuthor() == null) ? 0 : getBookAuthor().hashCode());
        result = prime * result + ((getBookType() == null) ? 0 : getBookType().hashCode());
        result = prime * result + ((getBookLocation() == null) ? 0 : getBookLocation().hashCode());
        result = prime * result + ((getBookStatus() == null) ? 0 : getBookStatus().hashCode());
        result = prime * result + ((getBookDescription() == null) ? 0 : getBookDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBookPhoto() == null) ? 0 : getBookPhoto().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookId=").append(bookId);
        sb.append(", bookNumber=").append(bookNumber);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookAuthor=").append(bookAuthor);
        sb.append(", bookType=").append(bookType);
        sb.append(", bookLocation=").append(bookLocation);
        sb.append(", bookStatus=").append(bookStatus);
        sb.append(", bookDescription=").append(bookDescription);
        sb.append(", bookPhoto=").append(bookPhoto);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}