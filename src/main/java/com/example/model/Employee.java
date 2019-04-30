package com.example.model;

import java.util.Date;

public abstract class Employee {
	private String empID;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	
	public Employee(String empID, String firstName, String lastName, String phone, String email, String password) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	public void createBook(String title, String author, String publisher, String ISBN, Date datePublished) {
		Book book = new Book(title, author, publisher, ISBN, datePublished);
		Library.addBook(book);
	}
	
	public Book searchBook(String title, String author, String isbn) {
		Book blank = new Book();
				
		for (Book b : Library.getBooks()) {
			if (b.getTitle() == title) {
				return b;
			}
			else if (b.getAuthor() == author) {
				return b;
			}
			else if (b.getIsbn() == isbn) {
				return b;
			}
		}
		return blank;
	}
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
