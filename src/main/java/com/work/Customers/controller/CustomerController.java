package com.work.Customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.Customers.model.Customer;
import com.work.Customers.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	@PostMapping
	public Customer save(@RequestBody Customer customer) {
		return service.createCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return service.getOneCustomer(id);
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@RequestBody Customer cus, @PathVariable Long id) {
		return service.updateCustomer( id, cus);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "Order Deleted Successfully";
	}

}
