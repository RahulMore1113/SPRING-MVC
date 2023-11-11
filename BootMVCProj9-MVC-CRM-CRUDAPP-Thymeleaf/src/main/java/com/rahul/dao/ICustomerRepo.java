package com.rahul.dao;

import org.springframework.data.repository.CrudRepository;

import com.rahul.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
