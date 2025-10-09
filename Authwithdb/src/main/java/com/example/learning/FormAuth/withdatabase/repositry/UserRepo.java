package com.example.learning.FormAuth.withdatabase.repositry;

import java.lang.annotation.Native;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.learning.FormAuth.withdatabase.model.User;

public interface UserRepo  extends JpaRepository<User, Integer>{
	@Query(value = "SELECT * FROM users WHERE username = :name", nativeQuery = true)
	User findByName(@Param("name") String name);

}
