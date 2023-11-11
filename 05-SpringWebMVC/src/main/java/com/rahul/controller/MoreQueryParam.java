package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoreQueryParam 
{
	
	@GetMapping("/name")
	public String getMoreInfo(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname, Model model)
	{
		
		String message = "First Name : " + fname + " Last Name : " + lname;
		model.addAttribute("query", message);
		return "index";
		
	}

}
