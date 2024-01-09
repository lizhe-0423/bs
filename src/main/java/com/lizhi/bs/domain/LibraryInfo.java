package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 图书馆信息表
 * @TableName library_info
 */
@TableName(value ="library_info")
public class LibraryInfo implements Serializable {
    /**
     * 信息ID
     */
    @TableId(type = IdType.AUTO)
    private Integer infoId;

    /**
     * 系统简介
     */
    private String systemIntro;

    /**
     * 公告
     */
    private String announcement;

    /**
     * 图书馆规则信息
     */
    private String rulesInfo;

    /**
     * 发布人
     */
    private String publisher;

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
     * 信息ID
     */
    public Integer getInfoId() {
        return infoId;
    }

    /**
     * 信息ID
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    /**
     * 系统简介
     */
    public String getSystemIntro() {
        return systemIntro;
    }

    /**
     * 系统简介
     */
    public void setSystemIntro(String systemIntro) {
        this.systemIntro = systemIntro;
    }

    /**
     * 公告
     */
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * 公告
     */
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    /**
     * 图书馆规则信息
     */
    public String getRulesInfo() {
        return rulesInfo;
    }

    /**
     * 图书馆规则信息
     */
    public void setRulesInfo(String rulesInfo) {
        this.rulesInfo = rulesInfo;
    }

    /**
     * 发布人
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 发布人
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
        LibraryInfo other = (LibraryInfo) that;
        return (this.getInfoId() == null ? other.getInfoId() == null : this.getInfoId().equals(other.getInfoId()))
            && (this.getSystemIntro() == null ? other.getSystemIntro() == null : this.getSystemIntro().equals(other.getSystemIntro()))
            && (this.getAnnouncement() == null ? other.getAnnouncement() == null : this.getAnnouncement().equals(other.getAnnouncement()))
            && (this.getRulesInfo() == null ? other.getRulesInfo() == null : this.getRulesInfo().equals(other.getRulesInfo()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInfoId() == null) ? 0 : getInfoId().hashCode());
        result = prime * result + ((getSystemIntro() == null) ? 0 : getSystemIntro().hashCode());
        result = prime * result + ((getAnnouncement() == null) ? 0 : getAnnouncement().hashCode());
        result = prime * result + ((getRulesInfo() == null) ? 0 : getRulesInfo().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
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
        sb.append(", infoId=").append(infoId);
        sb.append(", systemIntro=").append(systemIntro);
        sb.append(", announcement=").append(announcement);
        sb.append(", rulesInfo=").append(rulesInfo);
        sb.append(", publisher=").append(publisher);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}