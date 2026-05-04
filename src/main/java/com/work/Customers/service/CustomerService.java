package com.work.Customers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.work.Customers.model.Customer;
import com.work.Customers.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	public Customer createCustomer(Customer cus) {
		return repo.save(cus);
	}
	
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}
	

	public Customer getOneCustomer(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Customer updateCustomer(Long id, Customer cus) {
		return repo.findById(id).map((c) -> {
			c.setName(cus.getName());
			c.setEmail(cus.getEmail());
			c.setOrderDish(cus.getOrderDish());
			return repo.save(c);
		}).orElseThrow(() -> new RuntimeException("Customer Not Found"));
	}
	
	public String deleteCustomer(Long id) {
		repo.findById(id).orElseThrow(() -> new RuntimeException());
		return "Data Deleted Successfully";
	}

}
