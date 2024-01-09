package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 图书馆室表
 * @TableName library_rooms
 */
@TableName(value ="library_rooms")
public class LibraryRooms implements Serializable {
    /**
     * 图书馆室ID
     */
    @TableId(type = IdType.AUTO)
    private Integer roomId;

    /**
     * 图书馆室名
     */
    private String roomName;

    /**
     * 图书馆室简介
     */
    private String roomIntro;

    /**
     * 图书馆室是否空闲，0-不空闲，1-空闲
     */
    private Integer isAvailable;

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
     * 图书馆室ID
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 图书馆室ID
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 图书馆室名
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 图书馆室名
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 图书馆室简介
     */
    public String getRoomIntro() {
        return roomIntro;
    }

    /**
     * 图书馆室简介
     */
    public void setRoomIntro(String roomIntro) {
        this.roomIntro = roomIntro;
    }

    /**
     * 图书馆室是否空闲，0-不空闲，1-空闲
     */
    public Integer getIsAvailable() {
        return isAvailable;
    }

    /**
     * 图书馆室是否空闲，0-不空闲，1-空闲
     */
    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
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
        LibraryRooms other = (LibraryRooms) that;
        return (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getRoomName() == null ? other.getRoomName() == null : this.getRoomName().equals(other.getRoomName()))
            && (this.getRoomIntro() == null ? other.getRoomIntro() == null : this.getRoomIntro().equals(other.getRoomIntro()))
            && (this.getIsAvailable() == null ? other.getIsAvailable() == null : this.getIsAvailable().equals(other.getIsAvailable()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        result = prime * result + ((getRoomIntro() == null) ? 0 : getRoomIntro().hashCode());
        result = prime * result + ((getIsAvailable() == null) ? 0 : getIsAvailable().hashCode());
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
        sb.append(", roomId=").append(roomId);
        sb.append(", roomName=").append(roomName);
        sb.append(", roomIntro=").append(roomIntro);
        sb.append(", isAvailable=").append(isAvailable);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}