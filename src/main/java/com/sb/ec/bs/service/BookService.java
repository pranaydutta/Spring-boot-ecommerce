package com.sb.ec.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.ec.bs.dao.BookRepository;
import com.sb.ec.bs.model.Book;

@Service
public class BookService implements BookInterf{
	
	@Autowired
	private BookRepository repository;

	@Override
	public List<Book> getBooks() {
		return repository.findAll();
	}

	@Override
	public void addBook(Book book) {
		repository.save(book);		
	}

	@Override
	public void deleteBook(long id) {
		repository.deleteById(id);		
	}

	@Override
	public void updateBook(Book book) {
		repository.save(book);
	}
	
	

}
