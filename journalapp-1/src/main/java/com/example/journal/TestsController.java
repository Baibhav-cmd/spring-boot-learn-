package com.example.journal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestsController {

	@RequestMapping("/")
	public String handleTest() {
		return "home";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}
