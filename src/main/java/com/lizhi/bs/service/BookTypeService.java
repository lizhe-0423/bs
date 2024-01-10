package com.lizhi.bs.service;

import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.BookType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【book_type(图书类别表)】的数据库操作Service
 * @createDate 2024-01-10 16:47:54
 */
public interface BookTypeService extends IService<BookType> {

    /**
     * 获取图书类别列表
     *
     * @return BaseResponse<List < BookType>>
     */
    BaseResponse<List<BookType>> getBookTypeList();

}
