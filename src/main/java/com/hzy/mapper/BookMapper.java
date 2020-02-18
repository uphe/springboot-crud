package com.hzy.mapper;

import com.hzy.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper // 表示这是mybatis的一个mapper类
@Repository //相当于@Component
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(int id);
    int updateBook(Book book);
    Book queryBookById(int id);
    Book queryBookByName(String bookName);
    List<Book> queryAllBook();
}
