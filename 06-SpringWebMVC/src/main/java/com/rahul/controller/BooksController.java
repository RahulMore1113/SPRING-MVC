package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BooksController 
{
	
	@GetMapping(value = "/book/{bname}/{authorname}")
	public String getBooks(@PathVariable("bname") String bname, @PathVariable("authorname") String authorname, Model model)
	{
		String message = "Book Name : " + bname + " is author of " + authorname + " which is very famouse";
		model.addAttribute("book", message);
		return "index";

	}

}
