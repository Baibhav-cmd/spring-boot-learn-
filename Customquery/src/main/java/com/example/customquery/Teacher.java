package com.example.customquery;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
@Id 
@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int Id;
@Column( length=100,nullable = false ,unique=true)
private String name;
 public Teacher() {}

public Teacher(int id, String name, String email) {
	super();
	Id = id;
	this.name = name;
	Email = email;
}
@Override
public String toString() {
	return "Teacher [Id=" + Id + ", name=" + name + ", Email=" + Email + "]";
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Column( length=100,nullable = false ,unique=true)
private String Email;
}
