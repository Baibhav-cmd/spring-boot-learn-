package com.example.jparest.entity;

import org.hibernate.metamodel.ValueClassification;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
	@Column(name = "User name",unique = false,length=60)
private String uName;
	@Column(name="user email",unique=true,length=50)
private String Email;
	@JoinColumn(name="Postalcode")
    @OneToOne(cascade = CascadeType.ALL) 
private Address Address; 


public  User() {}


public int getId() {
	return Id;
}


public void setId(int id) {
	Id = id;
}


public String getuName() {
	return uName;
}


public void setuName(String uName) {
	this.uName = uName;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public Address getAddress() {
	return Address;
}


public void setAddress(Address address) {
	Address = address;
}


public User( String uName, String email, Address address) {
	super();
	this.uName = uName;
	Email = email;
	Address = address;
}


}
