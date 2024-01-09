package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.BookRule;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.service.BookRuleService;
import com.lizhi.bs.mapper.BookRuleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【book_rule】的数据库操作Service实现
* @createDate 2024-01-04 14:29:33
*/
@Service
public class BookRuleServiceImpl extends ServiceImpl<BookRuleMapper, BookRule>
    implements BookRuleService{

    @Override
    public BaseResponse<List<BookRule>> getRuleList() {
        List<BookRule> list = this.list();
        if(list.isEmpty()){
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"没有规则");
        }
        return ResultUtils.success(list);
    }
}




