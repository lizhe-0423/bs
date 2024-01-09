package com.lizhi.bs.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.Books;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【books(图书表)】的数据库操作Service
* @createDate 2024-01-02 09:46:25
*/
public interface BooksService extends IService<Books> {
    /**
     * 分页查询
     * @param request 分页参数
     * @return BaseResponse<Page<Books>>
     */
    BaseResponse<Page<Books>> searchBooks(BasePageRequest request);
}
