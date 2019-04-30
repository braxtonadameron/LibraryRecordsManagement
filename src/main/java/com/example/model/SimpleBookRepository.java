package com.example.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {
	private Library library;
	
	public SimpleBookRepository() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Book 1", "Author 1", "Publisher 1", "0000", new Date()));
		books.add(new Book("Book 2", "Author 2", "Publisher 1", "0001", new Date()));
		books.add(new Book("Book 3", "Author 1", "Publisher 2", "0002", new Date()));
		books.add(new Book("Book 4", "Author 2", "Publisher 3", "0003", new Date()));
		books.add(new Book("Book 5", "Author 3", "Publisher 4", "0004", new Date()));
		
		library = new Library(books);
	}
	
	@Override
	public ArrayList<Book> getBooks() {
		return library.getBooks();
	}
	
	@Override
	public ArrayList<Book> getByTitle(String title) {
		ArrayList<Book> booksFound = new ArrayList<Book>();
		for (Book book : library.getBooks()) {
			if (book.getTitle().contains(title)) {
				booksFound.add(book);
			}
		}
		return booksFound;
	}
	
	@Override
	public boolean addBook(Book book) {
		return library.addBook(book);
	}
}
