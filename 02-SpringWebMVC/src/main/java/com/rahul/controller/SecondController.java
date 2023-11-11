package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController 
{
	@GetMapping("/welcome")
	public String someWork(Model model)
	{
		model.addAttribute("work", "Second Controller");
		
		return "index";
	}
	
	@GetMapping("/java")
	public String someOtherWork(Model model)
	{
		model.addAttribute("work", "Second Controller java");
		
		return "index";
	}
	
	@GetMapping
	public String getName(Model model)
	{
		model.addAttribute("message", "My name is Rahul More");
		
		return "index";
	}
	
	@PostMapping
	public String getAddress(Model model)
	{
		model.addAttribute("message", "Pune");
		
		return "index";
	}
}
