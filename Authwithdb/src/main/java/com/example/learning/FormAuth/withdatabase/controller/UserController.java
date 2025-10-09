package com.example.learning.FormAuth.withdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.learning.FormAuth.withdatabase.model.User;
import com.example.learning.FormAuth.withdatabase.service.UserService;


@Controller
@RequestMapping("/auth")
public class UserController {

	@Autowired
	private UserService us;
	
	
	@GetMapping("/alluser")
	public List<User> getalluser(){
		return this.us.getallluser();
	}
}
