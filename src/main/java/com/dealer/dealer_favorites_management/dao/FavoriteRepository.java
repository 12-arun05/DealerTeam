package com.dealer.dealer_favorites_management.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dealer.dealer_favorites_management.model.Favorite;

import java.util.List;

@Repository
public interface FavoriteRepository extends CrudRepository<Favorite, Integer>{

	Favorite findByDealerName(String dealerName);
	List<Favorite> findByReason(String reason);

}
