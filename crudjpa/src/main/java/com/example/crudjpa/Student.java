package com.example.crudjpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Section=" + Section + ", Address=" + Address + "]";
	}

	private String Section;
	private String Address;

// constructor without feild
	public Student() {

	}
// constructor with feild

	public Student(int id, String name, String section, String address) {
		super();
		Id = id;
		Name = name;
		Section = section;
		Address = address;
	}

//getter and setter
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}
