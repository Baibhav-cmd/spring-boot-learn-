package com.example.learning.FormAuth.model;

public class User {

	
	private String name;
	private String email;
  private String password;
  
  // constructor without argument
  public User() {}

  // constructor with argument\	
  public User(String name, String email, String password) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
}

  // getter and setter
  

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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
