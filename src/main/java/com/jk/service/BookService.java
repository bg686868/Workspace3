package com.jk.service;

import com.jk.model.Book;

import java.util.List;

public interface BookService {

    List<Book> queryBookList();

    void addBook(Book book);

    Book queryByid(Integer id);

    void deleteBook(Book book);
}
