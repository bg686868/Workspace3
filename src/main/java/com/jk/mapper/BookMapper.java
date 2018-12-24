package com.jk.mapper;

import com.jk.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookMapper extends JpaRepository<Book,Integer > {

    @Query(value="select b.id,b.name,b.date,b.type,b.url from Book b")
    List<Book> queryBookListAnnotion();

}
