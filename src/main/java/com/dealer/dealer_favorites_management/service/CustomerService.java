package com.dealer.dealer_favorites_management.service;

import com.dealer.dealer_favorites_management.dao.CustomerRepository;
import com.dealer.dealer_favorites_management.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
	@Autowired
	private CustomerRepository repo;

    public Customer getCustomerByName(String customerName) {
        return repo.findByCustomerName(customerName).orElse(null);
    }
}
