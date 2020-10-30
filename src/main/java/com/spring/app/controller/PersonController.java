package com.spring.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.app.model.Persons;


@Controller
public class PersonController {

	@GetMapping("/")
	public String showForms(Persons person) {
		return "register";
	}
	
	@PostMapping("/")
	public String register(@Valid Persons person,Errors errors,Model model) {
		
		if(errors.hasErrors()) {
			return "register";
		}else {
			model.addAttribute("message", "Registration successfully........");
			return "register";
		}
		
	}
}
