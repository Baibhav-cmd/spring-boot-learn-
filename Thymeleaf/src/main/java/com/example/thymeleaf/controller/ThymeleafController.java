package com.example.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
public class ThymeleafController {
	
	@GetMapping("/about")    
 public String about(Model model) {
		System.out.println("inside about");
		model.addAttribute("name","Baibhav");
		model.addAttribute("currentdate",new Date());
	 return "about";
 }
	
	// for handling Iteration in iteration
 
	@GetMapping("/second")
	public String iteration(Model model) 
{
		List<Integer> aa=new ArrayList<Integer>(List.of(1,2,3,4,5));
		model.addAttribute("aa",aa);
		return "iterate";
}
	@GetMapping("/third")
	public String conditonal(Model model) {
	int a=30, b=20;
	model.addAttribute("variable",a);
	model.addAttribute("variable2",b);
	return "condition";
}
}