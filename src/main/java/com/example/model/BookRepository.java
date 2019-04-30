package com.example.model;

import java.util.ArrayList;

public interface BookRepository {
	ArrayList<Book> getBooks();
	ArrayList<Book> getByTitle(String title);
	boolean addBook(Book book);
}
