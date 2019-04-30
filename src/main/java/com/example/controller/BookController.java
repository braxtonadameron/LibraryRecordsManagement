package com.example.controller;

import com.example.model.Book;
import com.example.model.BookRepository;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	private final BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
    @GetMapping("/books")
    ArrayList<Book> getBooks(String title) {
    	if (title == null || title.isEmpty())
    		return bookRepository.getBooks();
    	return bookRepository.getByTitle(title);
    }
    
    @PostMapping("/book")
	boolean echo(@RequestBody Book book) {
		return bookRepository.addBook(book);
	}
}
