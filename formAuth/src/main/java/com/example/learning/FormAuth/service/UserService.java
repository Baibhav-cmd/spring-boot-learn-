package com.example.learning.FormAuth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.FormAuth.model.User;

@Service
public class UserService {

	User u1 = new User("baibhav", "baibhav12@gmail.com", "1166");

	User u2 = new User("baibhavt", "baibhav31@gmail.com", "2266");

	// adding the user into list

    // Use ArrayList for a mutable list
    List<User> user = new ArrayList<>();

    // Constructor to add initial users
    public UserService() {
        user.add(u1);
        user.add(u2);
    }

	
	
	public List<User> getalluser(){
		return this.user;
	}
	
	public User getuserbyname(String name) {
		return user.stream().filter(user->user.getName().equals(name)).findFirst().orElse(null) ;
	}
	public boolean addUser(User u) {
		return this.user.add(u);
	}
}
