package com.lizhi.bs.domain.es;


import lombok.Data;
import org.dromara.easyes.annotation.HighLight;
import org.dromara.easyes.annotation.IndexId;
import org.dromara.easyes.annotation.IndexName;
import org.dromara.easyes.annotation.rely.IdType;

/**
 * ES数据模型
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 *
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>*/
@Data
@IndexName("document")
public class Document {
    /**
     * es中的唯一id
     */
    @IndexId(type = IdType.CUSTOMIZE)
    private String id;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 文档标题
     */
    private String title;
    /**
     * 章节标题
     */
    private Integer chapterNumber;
    /**
     * 文档内容
     */
    @HighLight
    private String content;
}
