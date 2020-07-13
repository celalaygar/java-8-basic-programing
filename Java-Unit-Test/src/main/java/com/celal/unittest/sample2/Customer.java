package com.celal.unittest.sample2;

public class Customer {

	int id;
	String fullName;
	String email;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String fullName, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
