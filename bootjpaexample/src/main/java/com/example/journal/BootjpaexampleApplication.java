package com.example.journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.journal.dao.Userrepo;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		Userrepo userrepo=context.getBean(Userrepo.class);
		
		User user =new User();
		user.setName("baibahyv");
		user.setCity("kathmandu");
		
		User save1=userrepo.save(user);
		System.out.println(save1);
		
		
		
	}

}
