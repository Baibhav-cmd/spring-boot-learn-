package com.example.learning.FormAuth.withdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.learning.FormAuth.withdatabase.model.User;
import com.example.learning.FormAuth.withdatabase.repositry.UserRepo;
import com.example.learning.FormAuth.withdatabase.security.UserAuth;

@SpringBootApplication
public class AuthwithdbApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    @Autowired
    private UserRepo userrepo;

    public static void main(String[] args) {
        SpringApplication.run(AuthwithdbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(); 
        user1.setUsername("baibhav");
        user1.setEmail("baibhav23@gmail.com");
        user1.setPassword(this.bcrypt.encode("baibhav"));
        user1.setRole("USER");

        this.userrepo.save(user1);
        System.out.println("✅ User saved to database!");
    }
}
