package com.rahul.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rahul.model.Customer;
import com.rahul.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	@GetMapping("/list")
	public String showCustomers(Map<String, Object> model) {

		List<Customer> customers = service.getCustomers();
		model.put("customers", customers);

		return "/customers/list-customers";

	}

	@GetMapping("/showForm")
	public String showForm(Map<String, Object> model) {

		Customer customer = new Customer();
		model.put("customer", customer);

		return "/customers/customer-form";

	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer) {

		System.out.println(customer);

		service.saveCustomer(customer);

		return "redirect:/customer/list";

	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam Integer customerId, Map<String, Object> model) {

		Customer customer = service.getCustomer(customerId);

		model.put("customer", customer);

		return "/customers/customer-form";

	}

	@PostMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam Integer customerId) {

		service.deleteCustomer(customerId);

		return "redirect:/customer/list";

	}

}
