package com.lizhi.bs.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @TableName ai_intelligent
 */
@TableName(value ="ai_intelligent")
@Data
public class AiIntelligent implements Serializable {
    private Long id;

    private String inputMessage;

    private String aiResult;

    private Long userId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}