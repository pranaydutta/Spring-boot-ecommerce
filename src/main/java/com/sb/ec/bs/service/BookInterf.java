package com.sb.ec.bs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.ec.bs.model.Book;

@Service
public interface BookInterf {
	
	public List<Book> getBooks();
	public void addBook(Book book);
	public void deleteBook(long id);
	public void updateBook(Book book);

}
