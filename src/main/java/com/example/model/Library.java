package com.example.model;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;
    private static ArrayList<Employee> employees;

    public Library() { }

    public Library(ArrayList<Book> books, ArrayList<Employee> employees) {
        Library.books = books;
        Library.employees = employees;
    }

    public Library(ArrayList<Book> books) {
        Library.books = books;
    }
    
    public static boolean addBook(Book book) {
    	return books.add(book);
    }
    
    public static boolean removeBook(Book book) {
    	return books.remove( book );
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        Library.books = books;
    }

    public ArrayList<Employee> getLibrarians() {
        return employees;
    }

    public void setLibrarians(ArrayList<Employee> employees) {
        Library.employees = employees;
    }
}
