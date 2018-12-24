/**
 * Copyright (C),金科教育
 * FileName: BookController
 * Author:   刘宇冰
 * Date:     2018/12/21 20:06
 * History:
 */
package com.jk.controller;

import com.jk.model.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈1〉
 *
 * @author 刘宇冰
 * @create 2018/12/21
 * @since 1.0.0
 */
@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("booklist")
    public String booklist() {
        return "booklist";
    }

    @RequestMapping("queryBookList")
    @ResponseBody
    public List<Book> queryBookList(){
        List<Book> list= bookService.queryBookList();
       return list;
    }

    @RequestMapping("addBook")
    @ResponseBody
    public void addBook(Book book){
        bookService.addBook(book);
    }

    @RequestMapping("queryByid")
    @ResponseBody
    public Book queryByid(Integer id){
        return  bookService.queryByid(id);
    }

    @RequestMapping("deleteBook")
    public  void deleteBook(Book book){
        bookService.deleteBook(book);
    }

}
