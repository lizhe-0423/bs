package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.domain.Violation;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.mapper.ViolationMapper;
import com.lizhi.bs.service.ViolationService;

import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【violation】的数据库操作Service实现
* @createDate 2024-01-08 16:09:28
*/
@Service
public class ViolationServiceImpl extends ServiceImpl<ViolationMapper, Violation>
    implements ViolationService {

    @Override
    public BaseResponse<Page<Violation>> getViolation(BasePageRequest request) {
        int userId = request.getUserId();

        LambdaQueryWrapper<Violation> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Violation::getUsersId, userId);
        List<Violation> list = this.list(queryWrapper);
        if(list.isEmpty()){
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "当前用户没有违规信息");
        }
        return null;
    }
}




