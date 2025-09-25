package com.example.jparest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jparest.entity.User;
import com.example.jparest.service.UserService;

@RestController
public class MainController {
	@Autowired
	public UserService us;
// getting the user
	@GetMapping("/aaa")
	public ResponseEntity<List<User>> getall() {

		List<User> user = us.getall();
		try {
		

			if (user == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
		return ResponseEntity.of(Optional.of(user));
	}
	
	// post user
	@PostMapping("/bbb")
	public ResponseEntity<User> addingData(@RequestBody User user){
		User  saveduser=us.adds(user);
		try {
			if(user==null) {
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
			}
		}
	catch(Exception e) {
		e.printStackTrace();
	}
		return ResponseEntity.of(Optional.of(user));
	}

	//deleting the data                     
	public void delete(@PathVariable int id) {
		
		us.deleteUser(id);
		
	}
}


