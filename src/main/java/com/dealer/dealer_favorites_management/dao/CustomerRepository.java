
	package com.dealer.dealer_favorites_management.dao;

import org.springframework.data.repository.CrudRepository;

import com.dealer.dealer_favorites_management.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	java.util.Optional<Customer> findByCustomerName(String customerName);
	void deleteByCustomerName(String customerName);

}
