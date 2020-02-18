package com.hzy;

import com.hzy.mapper.BookMapper;
import com.hzy.pojo.Book;
import com.hzy.service.BookService;
import com.hzy.service.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class SpringbootCrudApplicationTests {


    @Autowired
    BookServiceImpl bookService;
    @Test
    void contextLoads() {
        List<Book> books = bookService.queryAllBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
