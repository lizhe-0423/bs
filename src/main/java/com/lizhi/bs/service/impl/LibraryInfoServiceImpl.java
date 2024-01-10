package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.LibraryInfo;
import com.lizhi.bs.mapper.mp.LibraryInfoMapper;
import com.lizhi.bs.service.LibraryInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【library_info(图书馆信息表)】的数据库操作Service实现
* @createDate 2024-01-02 09:46:25
*/
@Service
public class LibraryInfoServiceImpl extends ServiceImpl<LibraryInfoMapper, LibraryInfo>
    implements LibraryInfoService {

    @Override
    public BaseResponse<List<LibraryInfo>> getNoticeList() {
        List<LibraryInfo> list = this.list();
        return ResultUtils.success(list);
    }
}




