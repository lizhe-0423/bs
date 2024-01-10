package com.lizhi.bs.service.impl;

import cn.hutool.core.text.CharSequenceUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhi.bs.common.BasePageRequest;
import com.lizhi.bs.common.BaseResponse;
import com.lizhi.bs.common.ResultUtils;
import com.lizhi.bs.domain.Books;
import com.lizhi.bs.domain.es.Document;
import com.lizhi.bs.mapper.mp.BooksMapper;
import com.lizhi.bs.mapper.es.DocumentMapper;
import com.lizhi.bs.service.BooksService;
import lombok.extern.slf4j.Slf4j;
import org.dromara.easyes.core.conditions.select.LambdaEsQueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 * @description 针对表【books(图书表)】的数据库操作Service实现
 * @createDate 2024-01-02 09:46:24
 */
@Service
@Slf4j
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books>
        implements BooksService {

    @Resource
    private DocumentMapper documentMapper;

    @Override
    public BaseResponse<Page<Books>> searchBooks(BasePageRequest request) {
        log.info("service层:执行图书搜索,搜索条件={}", request);
        String condition = request.getCondition();
        String query = request.getQuery();
        int pageSize = request.getPageSize();
        int pageNum = request.getPageNum();
        // 创建分页构造器
        Page<Books> booksPage = new Page<>(pageNum, pageSize);
        QueryWrapper<Books> booksQueryWrapper = new QueryWrapper<>();
        if (CharSequenceUtil.isNotBlank(condition) && CharSequenceUtil.isNotBlank(query)) {
            if ("book_content".equals(condition)) {
                log.info("service层:执行ES图书内容={}查找", query);
                LambdaEsQueryWrapper<Document> wrapper = new LambdaEsQueryWrapper<>();
                wrapper.match(Document::getContent, query);
                List<Document> documents = documentMapper.selectList(wrapper);
                log.info("service层:执行ES图书内容={}查找,查询结果={}", query, documents);
                if (!documents.isEmpty()) {
                    ArrayList<String> booksNameList = new ArrayList<>();
                    for (Document document : documents) {
                        booksNameList.add(document.getBookName());
                    }
                    booksQueryWrapper.in("book_name", booksNameList);
                }
            } else {
                booksQueryWrapper.like(condition, query);
            }
        }
        Page<Books> page = this.page(booksPage, booksQueryWrapper);
        return ResultUtils.success(page);
    }
}




