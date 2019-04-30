package com.example.model;

import java.util.ArrayList;
import java.util.Date;

public class SimpleAdminList implements AdminList {

	public SimpleAdminList() {
		Admin.promote("1");
		Admin.promote("2");
		Admin.promote("3");
	}
	
	@Override
	public ArrayList<Admin> getAdmins() {
		return Admin.getAdmins();
	}
}
