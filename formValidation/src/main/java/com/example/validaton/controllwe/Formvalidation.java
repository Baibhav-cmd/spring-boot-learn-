package com.example.validaton.controllwe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.validaton.entity.Logindata;

import jakarta.validation.Valid;

@Controller
public class Formvalidation {

	
	@GetMapping("/formvalidate")
	public String openForm(Model model) {
		model.addAttribute("logindata",new Logindata());
		return "form";
	}
	
	@PostMapping("/sumbit")
	public String Processform(@Valid @ModelAttribute("logindata") Logindata logindata,BindingResult result) {
		if(result.hasErrors()) {
			return "form";
		}
		return "sucess";
	}  
}
