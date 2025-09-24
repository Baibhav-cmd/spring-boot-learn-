package com.example.restapi.entity;

public class Book {
	private int Id;
	private String Name;
	private String author;
	private float price;

	public Book() {

	}

	public Book(int id, String name, String author, float price) {
		super();
		Id = id;
		Name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Name=" + Name + ", author=" + author + ", price=" + price + "]";
	}

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
