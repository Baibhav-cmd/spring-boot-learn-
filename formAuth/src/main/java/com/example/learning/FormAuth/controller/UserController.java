package com.example.learning.FormAuth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.FormAuth.model.User;
import com.example.learning.FormAuth.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;

	@GetMapping("/user")
	public ResponseEntity<List<User>> getalluser() {
		List<User> users = this.userservice.getalluser();

		if (users.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.ok(users);
	}

	@GetMapping("/user/{name}")
	public ResponseEntity<User> getbyname(@PathVariable String name) {
		User user= this.userservice.getuserbyname(name);
		if(user==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.ok(user);
	}

	@PostMapping("/useradd")
	public  ResponseEntity<Boolean> addUser(@RequestBody User user) {
		boolean add= this.userservice.addUser(user);
		if(!add) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}
		return ResponseEntity.ok(add);
	}
}
