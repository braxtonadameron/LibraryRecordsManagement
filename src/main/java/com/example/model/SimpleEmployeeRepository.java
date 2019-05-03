package com.example.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class SimpleEmployeeRepository implements EmployeeRepository {
	private Library library;
	
	public SimpleEmployeeRepository() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Book 1", "Author 1", "Publisher 1", "0000", new Date()));
		books.add(new Book("Book 2", "Author 2", "Publisher 1", "0001", new Date()));
		books.add(new Book("Book 3", "Author 1", "Publisher 2", "0002", new Date()));
		books.add(new Book("Book 4", "Author 2", "Publisher 3", "0003", new Date()));
		books.add(new Book("Book 5", "Author 3", "Publisher 4", "0004", new Date()));
		employees.add(new Admin("admin1", "Admin", "Admin", "###-###-####", "admin@email.com", "password1"));
		employees.add(new Librarian("user1", "Librarian", "Librarian", "###-###-####", "librarian@email.com", "password2"));
		
		library = new Library(books, employees);
	}
	
	@Override
	public boolean login(String empID, String password) {
		for ( Employee emp : library.getLibrarians() ) {
			if ( emp.getEmpID().equals(empID) && emp.getPassword().equals(password) ) {
				return true;
			}
		}
		return false;
	}

}
