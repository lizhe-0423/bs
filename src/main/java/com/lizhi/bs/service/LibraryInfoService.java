package com.lizhi.bs.service;

import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.LibraryInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【library_info(图书馆信息表)】的数据库操作Service
* @createDate 2024-01-02 09:46:25
*/
public interface LibraryInfoService extends IService<LibraryInfo> {
    /**
     * 获取公告列表
     * @return BaseResponse<LibraryInfo>
     */
    BaseResponse<List<LibraryInfo>> getNoticeList();
}
