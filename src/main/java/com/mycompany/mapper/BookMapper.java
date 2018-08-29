package com.mycompany.mapper;

import java.util.*;
import org.apache.ibatis.annotations.*;

import com.mycompany.vo.Book;

public interface BookMapper {
	@Insert("insert into books (title, author, image) values (#{title}, #{author}, #{image})")
	public boolean create(Book book);

	@Select("SELECT * FROM books")
	public List<Book> getList();

	@Select("select * from books where id = #{id}")
	public Book getBook(int id);
	
	@Update("update books set title = #{title}, author = #{author}, image = #{image} where id = #{id}")
	public boolean update(Book book);
	
	@Delete("delete from books where id = #{id}")
	public boolean delete(int id);
}