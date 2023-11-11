package com.rahul.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rahul.model.Employee;

@Controller
public class TestController {

	@GetMapping("/")
	public String showHome() {

		return "home";

	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> model) {

		model.put("name", "Rahul");
		model.put("age", 23);
		model.put("address", "Pune");
		
//		String[] countryNames = new String[] {"IND", "USA", "LA", "UK"};
//		model.put("countryNames", countryNames);
		
		List<Employee> empList = List.of(new Employee(10, "Rahul", "Developer", 324.0),
				new Employee(11, "Krishna", "Love", 999.9),
				new Employee(12, "More", "DevOps", 231.0)
				);
		
		model.put("empList", empList);

		return "show_report";

	}

}
