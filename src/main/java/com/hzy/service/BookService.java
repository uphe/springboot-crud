package com.hzy.service;

import com.hzy.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    int addBook(Book book);
    int deleteBookById(int id);
    int updateBook(Book book);
    Book queryBookById(int id);
    Book queryBookByName(String bookName);
    List<Book> queryAllBook();
}
