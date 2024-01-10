package com.lizhi.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.domain.BookChapters;
import com.lizhi.bs.mapper.mp.BookChaptersMapper;
import com.lizhi.bs.service.BookChaptersService;
import org.springframework.stereotype.Service;

/**
* @author <a href="https://github.com/lizhe-0423">lizhi</a>
* @description 针对表【book_chapters(图书章节表)】的数据库操作Service实现
* @createDate 2024-01-02 09:46:24
*/
@Service
public class BookChaptersServiceImpl extends ServiceImpl<BookChaptersMapper, BookChapters>
    implements BookChaptersService {

}




