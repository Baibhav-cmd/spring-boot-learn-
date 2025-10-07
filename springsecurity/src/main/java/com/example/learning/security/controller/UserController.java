package com.example.learning.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.security.model.User;
import com.example.learning.security.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userser;

	// get user
	@GetMapping("/")
	public List<User> getallUser() {
		return this.userser.getallUser();
	}

	@GetMapping("/{id}")
	public User getUserbyId(@PathVariable int id) {

		return this.userser.getbyId(id);
	}

	@PostMapping("/add")
	public User postUser(@RequestBody User user) {

		return this.userser.addUser(user);

	}

}
