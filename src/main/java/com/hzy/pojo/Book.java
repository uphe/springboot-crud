package com.hzy.pojo;
import org.springframework.stereotype.Component;

@Component //该注解是组件的意思，放在类上，说明这个类被Spring管理了，也就是bean
public class Book {
    private int bookId;
    private String bookName;
    private int bookCount;
    private String bookDetail;

    public Book() {
    }

    public Book(int bookId, String bookName, int bookCount, String bookDetail) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.bookDetail = bookDetail;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", bookDetail='" + bookDetail + '\'' +
                '}';
    }
}
