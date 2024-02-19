package com.lizhi.bs.job;

import com.lizhi.bs.domain.BookChapters;
import com.lizhi.bs.domain.es.Document;
import com.lizhi.bs.mapper.es.DocumentMapper;
import com.lizhi.bs.service.impl.BookChaptersServiceImpl;
import com.lizhi.bs.service.impl.BooksServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Timer;

/**
 * {@code @name} bs
 * {@code @description}
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/4 9:58
 */
@Component
public class BooksSync implements CommandLineRunner {
    @Resource
    private DocumentMapper documentMapper;
    @Resource
    private BooksServiceImpl booksService;
    @Resource
    private BookChaptersServiceImpl bookChaptersService;
    @Override
    public void run(String... args) throws Exception {

        documentMapper.setCurrentActiveIndex("book_chapters");

        List<BookChapters> list = bookChaptersService.list();
        //将章节内容批量同步到es
        for (BookChapters bookChapters : list) {
            Document document = new Document();
            document.setId(String.valueOf(bookChapters.getChapterId()));
            document.setBookName(booksService.getById(bookChapters.getBookId()).getBookName());
            document.setTitle(bookChapters.getChapterTitle());
            document.setChapterNumber(bookChapters.getChapterNumber());
            document.setContent(bookChapters.getChapterContent());
            documentMapper.insert(document);
        }

    }
}
