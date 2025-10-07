package com.example.learning.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.security.model.User;

@Service
public class UserService {
	
	List<User> userw=new ArrayList<User>();
	
	
	public UserService() {
		
		userw.add(new User(123,"baibahv","baibhav123","baibhavthapa12@gmail.com"));	
		userw.add(new User(124,"ram","ram123","ram12@gmail.com"));	
		
	
	}
	
	// get all user
	public List<User> getallUser(){
		return this.userw;
	}
	
	// get by id
	public User getbyId(int id){
		
	 return this.userw.stream().filter((u)->u.getId()==id).findFirst().orElse(null);	
	}
	
	
	// add user
	
	public User addUser(User user) {
		userw.add(user);
		return user;
	}
	
}
