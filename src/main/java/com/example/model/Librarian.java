package com.example.model;

import java.util.ArrayList;

public class Librarian extends Employee{

	private static ArrayList<Librarian> libs;
	
	public Librarian(String empID, String firstName, String lastName, String phone, String email, String password) {
		super(empID, firstName, lastName, phone, email, password);
	
	}
	
	public static ArrayList<Librarian> getLibrarians() {
	        return libs;
	    }
	
	public static boolean addLibrarian(Librarian l) {
		return libs.add(l);
	}
	
}
