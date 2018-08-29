package com.mycompany.mapper;

import java.util.*;
import org.apache.ibatis.annotations.*;

import com.mycompany.vo.Book;

public interface BookMapper {
    @Insert("insert into books (title, author, image) values (#{title}, #{author}, #{image})")
    public boolean create(Book book);
    
    @Select("SELECT * FROM books")
    public List<Book> getList();
}