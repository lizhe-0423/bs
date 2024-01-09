package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 图书章节表
 * @TableName book_chapters
 */
@TableName(value ="book_chapters")
public class BookChapters implements Serializable {
    /**
     * 章节ID
     */
    @TableId(type = IdType.AUTO)
    private Integer chapterId;

    /**
     * 图书ID，外键关联到 books 表
     */
    private Integer bookId;

    /**
     * 章节数
     */
    private Integer chapterNumber;

    /**
     * 章节标题
     */
    private String chapterTitle;

    /**
     * 章节内容
     */
    private String chapterContent;

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
     * 章节ID
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * 章节ID
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 图书ID，外键关联到 books 表
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 图书ID，外键关联到 books 表
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 章节数
     */
    public Integer getChapterNumber() {
        return chapterNumber;
    }

    /**
     * 章节数
     */
    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    /**
     * 章节标题
     */
    public String getChapterTitle() {
        return chapterTitle;
    }

    /**
     * 章节标题
     */
    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    /**
     * 章节内容
     */
    public String getChapterContent() {
        return chapterContent;
    }

    /**
     * 章节内容
     */
    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent;
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
        BookChapters other = (BookChapters) that;
        return (this.getChapterId() == null ? other.getChapterId() == null : this.getChapterId().equals(other.getChapterId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getChapterNumber() == null ? other.getChapterNumber() == null : this.getChapterNumber().equals(other.getChapterNumber()))
            && (this.getChapterTitle() == null ? other.getChapterTitle() == null : this.getChapterTitle().equals(other.getChapterTitle()))
            && (this.getChapterContent() == null ? other.getChapterContent() == null : this.getChapterContent().equals(other.getChapterContent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChapterId() == null) ? 0 : getChapterId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getChapterNumber() == null) ? 0 : getChapterNumber().hashCode());
        result = prime * result + ((getChapterTitle() == null) ? 0 : getChapterTitle().hashCode());
        result = prime * result + ((getChapterContent() == null) ? 0 : getChapterContent().hashCode());
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
        sb.append(", chapterId=").append(chapterId);
        sb.append(", bookId=").append(bookId);
        sb.append(", chapterNumber=").append(chapterNumber);
        sb.append(", chapterTitle=").append(chapterTitle);
        sb.append(", chapterContent=").append(chapterContent);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}