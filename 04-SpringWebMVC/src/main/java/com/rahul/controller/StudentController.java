package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rahul.model.Student;

@Controller
public class StudentController 
{
	
	@GetMapping("/studentinfo")
	public String getData(Model model)
	{
		
		Student st = new Student();
		st.setId(01);
		st.setFirstName("Rahul");
		st.setLastName("More");
		st.setCity("Pune");
		st.setGender("Male");
		st.setDob("07-02-2000");
		model.addAttribute("std",st);
		return "student";
		
	}

}
