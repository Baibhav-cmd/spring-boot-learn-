package com.example.jparest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jparest.entity.User;


public interface UserRwepo extends JpaRepository<User, Integer>{
	 
	  
}
