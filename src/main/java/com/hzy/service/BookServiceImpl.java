package com.hzy.service;

import com.hzy.mapper.BookMapper;
import com.hzy.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public Book queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
