package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 借阅表
 *
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @TableName borrow_records
 */
@TableName(value = "borrow_records")
@Data
public class BorrowRecords implements Serializable {
    /**
     * 借阅ID
     */
    @TableId(type = IdType.AUTO)
    private Integer borrowId;

    /**
     * 借阅用户ID
     */
    private Integer userId;

    /**
     * 借阅图书ID
     */
    private Integer bookId;

    /**
     * 借阅日期
     */
    private Date borrowDate;

    /**
     * 归还日期
     */
    private Date returnDate;

    /**
     * 截止日期
     */
    private Date closeDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}