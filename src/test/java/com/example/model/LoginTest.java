package com.example.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {
	@Test
	public void testValidUsernamePassword() {
		SimpleEmployeeRepository empRepo = new SimpleEmployeeRepository();
		boolean loggedIn = empRepo.login("admin1", "password1");
		assertTrue(loggedIn);
	}

	@Test
	public void testValidUsernameInvalidPassword() {
		SimpleEmployeeRepository empRepo = new SimpleEmployeeRepository();
		boolean loggedIn = empRepo.login("admin1", "asdf");
		assertFalse(loggedIn);
	}
	
	@Test
	public void testInalidUsernamePassword() {
		SimpleEmployeeRepository empRepo = new SimpleEmployeeRepository();
		boolean loggedIn = empRepo.login("adm", "asdf");
		assertFalse(loggedIn);
	}
}
