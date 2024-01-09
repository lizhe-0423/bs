package com.lizhi.bs.service;

import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.BookRule;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【book_rule】的数据库操作Service
* @createDate 2024-01-04 14:29:33
*/
public interface BookRuleService extends IService<BookRule> {

    /**
     * 获取规则列表
     * @return BaseResponse<Page<BookRule>>
     */
    BaseResponse<List<BookRule>> getRuleList();

}
