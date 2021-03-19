package com.luv2code.mvc.mvcdemo.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luv2code.mvc.mvcdemo.dbo.Customer;
import com.luv2code.mvc.mvcdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping(path = {"/", "/list" })
	public ModelAndView getCustomersList(ModelAndView modelAndView) {
		modelAndView.setViewName("list-customers");
		List<Customer> customers = customerService.getCustomers();
		//Integer integer = customers.stream().map(c -> c.getId()).collect(Collectors.toList()).stream().min(Comparator.comparingInt(Integer::valueOf)).get();
		modelAndView.addObject("customers", customers);
		return modelAndView;
	}
	
	@GetMapping("/showFormForAdd")
	public ModelAndView showformForAdd(ModelAndView modelAndView) {
		Customer customer = new Customer();
		modelAndView.addObject("customer", customer);
		modelAndView.setViewName("customer-form");
		return modelAndView;
	}
	
	@PostMapping("/saveCustomer")
	public ModelAndView saveCustomer(@ModelAttribute Customer customer, ModelAndView modelAndView) {
		customerService.saveCustomer(customer);
		modelAndView.setViewName("redirect:/customer/list");
		return modelAndView;
	}
	
	@GetMapping("/showFormForUpdate")
	public ModelAndView showFormForUpdate(@RequestParam int customerId, ModelAndView modelAndView) {
		Customer customer = customerService.getCustomer(customerId);
		modelAndView.addObject("customer", customer);
		modelAndView.setViewName("customer-form");
		return modelAndView;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteCustomer(@RequestParam int customerId, ModelAndView modelAndView) {
		customerService.delete(customerId);
		modelAndView.setViewName("redirect:/customer/list");
		return modelAndView;
	}
	
}
