package com.luv2code.mvc.mvcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.mvc.mvcdemo.dbo.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
