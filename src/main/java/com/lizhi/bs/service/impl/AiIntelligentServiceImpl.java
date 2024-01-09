package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.AiIntelligent;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.manage.AiManage;
import com.lizhi.bs.mapper.AiIntelligentMapper;
import com.lizhi.bs.service.AiIntelligentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.lizhi.bs.constants.AiConstant.AI_BOOK_MODULE;


/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【ai_intelligent(AI智能表)】的数据库操作Service实现
* @createDate 2024-01-05 10:42:22
*/
@Service
public class AiIntelligentServiceImpl extends ServiceImpl<AiIntelligentMapper, AiIntelligent>
    implements AiIntelligentService {

    @Resource
    private AiManage aiManage;

    @Override
    public BaseResponse<String> aiIntelligent(AiIntelligent request) {
        String inputMessage = request.getInputMessage();
        if (inputMessage == null || inputMessage.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"输入信息不能为空");
        }
        String doChat = aiManage.doChat(AI_BOOK_MODULE, inputMessage);
        return ResultUtils.success(doChat);
    }

    @Override
    public BaseResponse<List<AiIntelligent>> getAiInformationByUserId(Long userId) {
        return null;
    }
}




