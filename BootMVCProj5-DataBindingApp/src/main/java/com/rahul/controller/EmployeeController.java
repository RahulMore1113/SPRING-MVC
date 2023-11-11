package com.rahul.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rahul.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register_emp")
	public String showHome() {

		return "home";

	}

	@PostMapping("/register_emp")
	public String registerEmployee(Map<String, Object> map, @ModelAttribute("emp") Employee employee) {

		System.out.println("EmployeeController.registerEmployee()");

		System.out.println(employee);
		map.put("employee", employee);

		return "result";

	}

}
