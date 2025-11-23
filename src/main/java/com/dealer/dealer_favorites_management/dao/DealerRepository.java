package com.dealer.dealer_favorites_management.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dealer.dealer_favorites_management.model.Dealer;

@Repository
public interface DealerRepository  extends CrudRepository<Dealer, Integer>{
	 void deleteByDealerName(String dealerName);

	 Optional<Dealer> findByDealerName(String dealerName);
}
