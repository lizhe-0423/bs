package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.BookType;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.mapper.mp.BookTypeMapper;
import com.lizhi.bs.service.BookTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【book_type(图书类别表)】的数据库操作Service实现
 * @createDate 2024-01-10 16:47:54
 */
@Service
public class BookTypeServiceImpl extends ServiceImpl<BookTypeMapper, BookType>
        implements BookTypeService {

    @Override
    public BaseResponse<List<BookType>> getBookTypeList() {
        List<BookType> list = this.list();
        if (list.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "图书类别为空");
        }
        return ResultUtils.success(list);
    }
}




