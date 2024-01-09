package com.lizhi.bs.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.BorrowRecords;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【borrow_records(借阅表)】的数据库操作Service
* @createDate 2024-01-02 09:46:25
*/
public interface BorrowRecordsService extends IService<BorrowRecords> {
    /**
    * @description 根据条件查询借阅记录
    * @param request 查询条件
    * @return Page<com.lizhi.bs.domain.BorrowRecords>>
    */
    BaseResponse<Page<BorrowRecords>> getBookBorrow(BasePageRequest request);

}
