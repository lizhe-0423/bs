package com.lizhi.bs.service;

import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.domain.AiIntelligent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【ai_intelligent(AI智能表)】的数据库操作Service
* @createDate 2024-01-05 10:42:22
*/
public interface AiIntelligentService extends IService<AiIntelligent> {

    /**
    * @description 根据用户id获取AI回复信息
    * @param request
    * @return com.lizhi.bs.common.BaseResponse<java.lang.String>
    */
    BaseResponse<String> aiIntelligent(AiIntelligent request);

    /**
    * @description 根据用户id获取AI对话信息
    * @param userId
    * @return com.lizhi.bs.common.BaseResponse<java.util.List<com.lizhi.bs.domain.AiIntelligent>>
    */
    BaseResponse<List<AiIntelligent>> getAiInformationByUserId(Long userId);

}
