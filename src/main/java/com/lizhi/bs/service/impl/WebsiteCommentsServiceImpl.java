package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.domain.WebsiteComments;
import com.lizhi.bs.service.WebsiteCommentsService;
import com.lizhi.bs.mapper.WebsiteCommentsMapper;
import org.springframework.stereotype.Service;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【website_comments(网站留言表)】的数据库操作Service实现
* @createDate 2024-01-02 09:46:25
*/
@Service
public class WebsiteCommentsServiceImpl extends ServiceImpl<WebsiteCommentsMapper, WebsiteComments>
    implements WebsiteCommentsService{

}




