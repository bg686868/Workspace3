/**
 * Copyright (C),金科教育
 * FileName: BookServiceImpl
 * Author:   刘宇冰
 * Date:     2018/12/21 20:08
 * History:
 */
package com.jk.service.impl;

import com.jk.mapper.BookMapper;
import com.jk.model.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈2〉
 *
 * @author 刘宇冰
 * @create 2018/12/21
 * @since 1.0.0
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> queryBookList() {
        return bookMapper.findAll();
    }

    @Override
    public void addBook(Book book) {
        bookMapper.save(book);
    }

    @Override
    public Book queryByid(Integer id) {
        Book one = bookMapper.findOne(id);
        return one;
    }

    @Override
    public void deleteBook(Book book) {
        bookMapper.delete(book);
    }

}
