package com.example.learning.FormAuth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/singin")
	public String login() {
		return "login";
	}
}
