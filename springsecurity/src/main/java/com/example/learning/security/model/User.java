package com.example.learning.security.model;

public class User {

	private int id;
	private String Username;
	private String Password;
	private String Email;

	// default construction
	
	public User() {}
	
	// parameterized constructor
	public User(int id,String Username,String Password,String Email) {
		this.id=id;
		this.Username=Username;
		this.Email=Email;
		this.Password=Password;
		
	}
	
	
   // getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
