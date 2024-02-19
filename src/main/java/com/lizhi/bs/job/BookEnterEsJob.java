package com.lizhi.bs.job;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * {@code @name} bs
 * {@code @description} 图书定时进入ES
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * {@code @data} 2024 2024/1/12 9:58
 */
//@Component(value = "bookEnterEsJob")
public class BookEnterEsJob {

    /**
     * 定时任务 每天23点执行 将图书数据同步到es
     */
    @Scheduled(cron = "0 0 23 * * ? *")
    public void BookToEs() throws Exception {
        new BooksSync().run();
    }
    @Scheduled(cron = "0 0 10 * * ? *")
    public void execute() throws Exception {

    }
}
