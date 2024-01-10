package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.AiIntelligent;
import com.lizhi.bs.exception.BusinessException;
import com.lizhi.bs.manage.AiManage;
import com.lizhi.bs.mapper.mp.AiIntelligentMapper;
import com.lizhi.bs.service.AiIntelligentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
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
        //调用AI接口
        String aiResult = aiManage.doChat(AI_BOOK_MODULE, inputMessage);
        Long userId = request.getUserId();
        if (userId == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"当前用户不存在");
        }
        AiIntelligent aiIntelligent = new AiIntelligent();
        aiIntelligent.setInputMessage(inputMessage);
        aiIntelligent.setAiResult(aiResult);
        aiIntelligent.setUserId(userId);
        this.save(aiIntelligent);
        return ResultUtils.success(aiResult);
    }

    @Override
    public BaseResponse<List<AiIntelligent>> getAiInformationByUserId(@NotNull Long userId) {
        LambdaQueryWrapper<AiIntelligent> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(AiIntelligent::getUserId, userId);
        wrapper.orderByAsc(AiIntelligent::getCreateTime);
        wrapper.last("limit 5");
        List<AiIntelligent> list = this.list(wrapper);
        if(list.isEmpty()){
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"当前用户无与AI聊天记录");
        }
        return ResultUtils.success(list);
    }
}




