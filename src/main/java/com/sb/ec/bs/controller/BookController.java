package com.sb.ec.bs.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sb.ec.bs.model.Book;
import com.sb.ec.bs.service.BookInterf;

@RestController
@RequestMapping("/book")
//@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	private byte[] bytes;

	
	@Autowired
	private BookInterf bookService;
	
	@GetMapping("/getBooks")
	public List<Book> getBooks()
	{
		return bookService.getBooks();
	}
	
	@PostMapping("/upload")
	public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		this.bytes = file.getBytes();
	}

	@PostMapping("/add")
	public void createBook(@RequestBody Book book) throws IOException {
		book.setPicByte(this.bytes);
		bookService.addBook(book);
		this.bytes = null;
	}
	
	@PutMapping("/update")
	public void updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
	}

	@DeleteMapping(path = { "/{id}" })
	public void deleteBook(@PathVariable("id") long id) {
		 bookService.deleteBook(id);
	}

}
