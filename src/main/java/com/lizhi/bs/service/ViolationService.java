package com.lizhi.bs.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.Violation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【violation】的数据库操作Service
 * @createDate 2024-01-08 16:09:28
 */
public interface ViolationService extends IService<Violation> {
    /**
     * @Description: 获取违规记录
     * @Param: [request]
     * @return: com.lizhi.bs.common.BaseResponse<com.baomidou.mybatisplus.extension.plugins.pagination.Page < com.lizhi.bs.domain.Violation>>
     */
    BaseResponse<Page<Violation>> getViolation(BasePageRequest request);

}
