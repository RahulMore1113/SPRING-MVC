package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreatingController 
{
	@GetMapping("/greeting")
	public String dispGreetings(Model model)
	{
		
		String greet = "All the best for job";
		model.addAttribute("text", greet);
		
		return "index";
	}
}
