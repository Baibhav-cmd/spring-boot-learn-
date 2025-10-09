package com.example.learning.FormAuth.withdatabase.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.learning.FormAuth.withdatabase.model.CustomUserDetails;
import com.example.learning.FormAuth.withdatabase.model.User;
import com.example.learning.FormAuth.withdatabase.repositry.UserRepo;

@Service
public class UserService  implements UserDetailsService{

	@Autowired
	private UserRepo userrepo;
	
	// for getting all the data
	public List<User> getallluser() {
		return  userrepo.findAll();
	}
	
	public User postUser(User user) {
		return userrepo.save(user);
	}
	
	public User getbyname(String name) {
		return userrepo.findByName(name);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=this.userrepo.findByName(username);
		
	if(user==null) {
		throw new UsernameNotFoundException("user is not here");
	}
		return new CustomUserDetails(user);
	}
	
}
