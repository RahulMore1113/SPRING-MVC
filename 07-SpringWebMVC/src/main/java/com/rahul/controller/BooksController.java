package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rahul.binding.Books;

@Controller
public class BooksController 
{
	
	@GetMapping("/loadingform")
	public String loadingForm(Model model)
	{
		
		return "index";
		
	}
	
	@PostMapping("/save")
	public String afterSubmissionDisplay( Books bo, Model model)
	{
		
		model.addAttribute("book", bo);
		return "books";
		
	}

}
