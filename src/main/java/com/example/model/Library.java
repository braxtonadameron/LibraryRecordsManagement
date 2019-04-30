package com.example.model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Librarian> librarians;

    public Library() {
    }

    public Library(ArrayList<Book> books, ArrayList<Librarian> librarians) {
        this.books = books;
        this.librarians = librarians;
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    
    public boolean addBook(Book book) {
    	return books.add(book);
    }
    
    public boolean removeBook(Book book) {
    	return books.remove( book );
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Librarian> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(ArrayList<Librarian> librarians) {
        this.librarians = librarians;
    }
}
