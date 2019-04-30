package com.example.model;

import java.util.ArrayList;

public class Admin extends Employee {

	private static ArrayList<Admin> admins;

	public Admin(String empID, String firstName, String lastName, String phone, String email, String password) {
		super(empID, firstName, lastName, phone, email, password);

	}

	public static ArrayList<Admin> getAdmins() {
		return admins;
	}

	public static boolean promote(String uid) {
		for (Librarian l : Librarian.getLibrarians()) {
			if (l.getEmpID() == uid) {
				Admin a = new Admin(l.getEmpID(), l.getFirstName(), l.getLastName(), l.getPhone(), l.getEmail(),
						l.getPassword());
				admins.add(a);
				return true;
			}
		}
		return false;
	}

	public static boolean demote(String uid) {
		for (Admin a : getAdmins()) {
			if (a.getEmpID() == uid) {
				admins.remove(admins.indexOf(a));
				return true;
			}
		}
		return false;
	}

	public static boolean resetPassword(String uid) {
		for (Librarian l : Librarian.getLibrarians()) {
			if (l.getEmpID() == uid) {
				l.setPassword("default");
				return true;
			}

			for (Admin a : getAdmins()) {
				if (a.getEmpID() == uid) {
					a.setPassword("default");
					return true;
				}
			}
		}
		return false;
	}
}
