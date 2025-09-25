package com.example.jparest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Postalcode;
	@Column(length = 40)
	private String City;
	@Column(length = 50)
	private String state;

	public Address() {

	}

	public Address(int Postalcode, String city, String state) {
		super();
		Postalcode = Postalcode;
		City = city;
		this.state = state;
	}

	public int getPostalcode() {
		return Postalcode;
	}

	public void setPostalcode(int Postalcode) {
		Postalcode = Postalcode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
