package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.ICustomerRepo;
import com.rahul.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public List<Customer> getCustomers() {

		return (List<Customer>) repo.findAll();

	}

	@Override
	public void saveCustomer(Customer customer) {

		repo.save(customer);

	}

	@Override
	public Customer getCustomer(Integer customerId) {

		return repo.findById(customerId).get();

	}

	@Override
	public void deleteCustomer(Integer customerId) {

		repo.deleteById(customerId);

	}

}
