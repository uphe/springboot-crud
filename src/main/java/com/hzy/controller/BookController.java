package com.hzy.controller;

import com.hzy.pojo.Book;
import com.hzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    // controller掉用service
    @Autowired
    private BookService bookService;

    @RequestMapping("/home")
    public String queryAllBook(Model model, HttpSession session) {
        if (session.getAttribute("msg") != null) {
            List<Book> books = bookService.queryAllBook();
            model.addAttribute("books",books);
            return "home";
        }
        return "error";
    }

    //跳转到添加界面
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book,Model model) {
        System.out.println("添加图书");
        bookService.addBook(book);
        // 重定向
        return "redirect:/home";
    }

    //跳转到修改界面
    @RequestMapping("/toUpdateBook/{id}")
    public String toUpdateBook(@PathVariable("id") int id, Model model) {
        Book book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Book book) {
        bookService.updateBook(book);
        return "redirect:/home";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        bookService.deleteBookById(id);
        return "redirect:/home";
    }

    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName, Model model) {
        Book book = bookService.queryBookByName(bookName);
        List<Book> books = new ArrayList<Book>();
        books.add(book);
        model.addAttribute("books",books);
        return "home";
    }
}
