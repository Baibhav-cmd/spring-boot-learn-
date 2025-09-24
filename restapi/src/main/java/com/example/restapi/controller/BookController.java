package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.restapi.entity.Book;
import com.example.restapi.service.Bookservice;

@RestController
public class BookController {

	
	@Autowired
	
	private Bookservice bookservice;
//	
//	@RequestMapping(value="/books",method = RequestMethod.GET)
	@GetMapping("/book")
	public List<Book> getBooks() {
		return  this.bookservice.getallBook();
		
		
	}
	// getting by id
	@GetMapping("/onebook/{id}")
	public Book getonebook(@PathVariable int id) {
		return this.bookservice.getbookbyid(id);
	}
	//getting by name
	
	@GetMapping("/s-book/{name}")
	public Book getbyname(@PathVariable String name) {
		return this.bookservice.getbbookbyname(name);
	}
	
	
	 @GetMapping("/aaa")
	 public String getatring() {
		 return "sssss";
	 }
	 
	 
	 @PostMapping("/bro")
	 public Book addBok(@RequestBody Book b) {
		 Book saved = bookservice.addBook(b);
	        return saved	;
	 }
	 
	 @PostMapping("/books")
	 public Book addBook(@RequestBody Book b) {
		 Book saved2 = bookservice.addbook2(b);
	        return saved2;
	 }
	 @DeleteMapping("/del/{id}")
	 public void delBook(@PathVariable int id) {
		 
	this.bookservice.deleteBook(id);

	 }
	 @PutMapping("/putting/{id}")
	 public Book update(@RequestBody Book b,@PathVariable int id) {
		 this.bookservice.updatebook(b,id);
		 return b;
	 }
	 
}
