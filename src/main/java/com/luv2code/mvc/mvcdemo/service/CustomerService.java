package com.luv2code.mvc.mvcdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.mvc.mvcdemo.dbo.Customer;
import com.luv2code.mvc.mvcdemo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional(rollbackOn = Exception.class)
	public List<Customer> getCustomers(){
		List<Customer> list = customerRepository.findAll();
		return list;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void saveCustomer(Customer customer){
		Customer savedCustomer = customerRepository.save(customer);
		System.out.println(savedCustomer.getId());
	}

	public Customer getCustomer(int customerId) {
		Customer customer = customerRepository.getOne(customerId);
		return customer;
	}

	public void delete(int customerId) {
		customerRepository.deleteById(customerId);
	}
}
