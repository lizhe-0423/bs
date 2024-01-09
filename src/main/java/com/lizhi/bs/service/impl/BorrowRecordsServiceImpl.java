package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.BorrowRecords;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.mapper.BorrowRecordsMapper;
import com.lizhi.bs.service.BorrowRecordsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【borrow_records(借阅表)】的数据库操作Service实现
 * @createDate 2024-01-02 09:46:25
 */
@Service
public class BorrowRecordsServiceImpl extends ServiceImpl<BorrowRecordsMapper, BorrowRecords>
        implements BorrowRecordsService {

    @Override
    public BaseResponse<Page<BorrowRecords>> getBookBorrow(BasePageRequest request) {

        int userId = request.getUserId();

        LambdaQueryWrapper<BorrowRecords> queryWrapper = new LambdaQueryWrapper<>();
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        Page<BorrowRecords> pageInfo = new Page<>(pageNum, pageSize);

        queryWrapper.eq(BorrowRecords::getUserId, userId);
        List<BorrowRecords> list = this.list(queryWrapper);
        if (list.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "您当前没有借阅记录");
        }

        String condition = request.getCondition();
        String query = request.getQuery();

        // 有借阅记录但是没有查询条件
        if (StringUtils.isBlank(condition) || StringUtils.isBlank(query)) {

            queryWrapper.eq(BorrowRecords::getUserId, userId);
            Page<BorrowRecords> page = this.page(pageInfo, queryWrapper);
            return ResultUtils.success(page);

        } else {

            //根据条件查询借阅记录
            QueryWrapper<BorrowRecords> queryWrapperByCondition = new QueryWrapper<>();
            queryWrapperByCondition.like(condition, query);
            Page<BorrowRecords> page = this.page(pageInfo, queryWrapper);
            return ResultUtils.success(page);

        }
    }
}




