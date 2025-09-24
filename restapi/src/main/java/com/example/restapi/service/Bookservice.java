package com.example.restapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.restapi.entity.Book;

@Component
public class Bookservice {

	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(2,"java","dao",12.5f));
		list.add(new Book(3,"javaScript","sss",10.5f));
		list.add(new Book(4,"python","ppp",11.5f));
	}
	
	// get all book 
	public List <Book> getallBook(){
		return list;
	}
	// get book ny id
	public Book getbookbyid(int id) {
		return list.stream().filter(book->book.getId()==id).findFirst().orElse(null);
	}
	
	
	public Book getbbookbyname(String name) {
		return list.stream().filter(book->book.getName().equals(name)).findFirst().orElse(null);
	}
	
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

//
//public Book addbook2(Book book) {
//	list.add(book);
//	return book;
//}
public Book addbook2(Book book) {
	list.add(book);
	return book;

}

public boolean delBook(int id) {
    return list.removeIf(book -> book.getId() == id);
}
//
//public void deleteBook(int id) {
// 	list.stream().filter(book->book.getId()!=id
////	if(book.getId()!=id) {
////		return true;
////	}
////	else {
////		return false;
////	}
//	
//).collect(Collectors.toList());
//}


public void deleteBook(int id) {
 	list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
}

//update the book
public Book updatebook(Book b, int id) {
list=list.stream().map(book->{
	if(book.getId()==id) {
		book.setName(b.getName());
	}
	return book;
}).collect(Collectors.toList());
return b;
	
}

}
