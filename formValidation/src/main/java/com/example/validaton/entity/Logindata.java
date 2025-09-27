package com.example.validaton.entity;

import org.hibernate.validator.constraints.Email;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Logindata {
	
	@NotBlank(message="user name cannot be null")
	@Size(min=3,max=19,message="Username must be 3 ")

private String username;
	   @NotBlank(message = "Email is required")
	    @Email(message = "Email is not valid")
private String email;

         
	   @AssertTrue
	   private boolean agreed;


public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

// to string 
@Override
public String toString() {
	return "Logindata [username=" + username + ", Email=" + email + "]";
}

// getter and setter
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
