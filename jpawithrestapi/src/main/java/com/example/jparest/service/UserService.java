package com.example.jparest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jparest.entity.User;
import com.example.jparest.repo.UserRwepo;

@Service
public class UserService {

	@Autowired
	private UserRwepo userrepo;

	public List<User> getall() {
		return userrepo.findAll();

}
	// adding the book
	public User adds(User user) {
	
	return userrepo.save(user);
	}
	//deleting the user
	public void deleteUser(int id) {
		userrepo.deleteById(id);
	}
	
	
}
