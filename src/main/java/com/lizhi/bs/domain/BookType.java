package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @TableName book_type
 */
@TableName(value ="book_type")
@Data
public class BookType implements Serializable {
    private Integer typeId;

    private String typeName;

    private String typeContent;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}