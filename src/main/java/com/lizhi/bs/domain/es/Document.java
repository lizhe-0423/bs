package com.lizhi.bs.domain.es;

import lombok.Data;
import org.dromara.easyes.annotation.IndexName;


/**
 * ES数据模型
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 **/
@Data
@IndexName("document")
public class Document {
    /**
     * es中的唯一id
     */
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
    private String content;
}
