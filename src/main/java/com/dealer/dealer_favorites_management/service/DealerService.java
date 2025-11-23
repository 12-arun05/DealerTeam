package com.dealer.dealer_favorites_management.service;

import com.dealer.dealer_favorites_management.dao.DealerRepository;
import com.dealer.dealer_favorites_management.model.Dealer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DealerService {

	@Autowired
	private DealerRepository repo;

	// deleteByName
	public String deleteByName(String dealerName) {
		repo.deleteByDealerName(dealerName);
		return "Deleted dealer with name: " + dealerName;
	}

	// updateByName
	public Dealer updateByName(String dealerName, Dealer updatedDealer) {
		Dealer existingDealer = repo.findByDealerName(dealerName).orElse(null);
		if (existingDealer != null) {
			existingDealer.setDealerName(updatedDealer.getDealerName());
			existingDealer.setAddress(updatedDealer.getAddress());
			// set other fields as needed
			return repo.save(existingDealer);
		}
		return null;
	}

	// listByName
	public Dealer listByName(String dealerName) {
		return repo.findByDealerName(dealerName).orElse(null);
	}
}
