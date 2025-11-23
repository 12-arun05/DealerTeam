package com.dealer.dealer_favorites_management.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dealer.dealer_favorites_management.dao.FavoriteRepository;
import com.dealer.dealer_favorites_management.model.Favorite;
import java.util.List;
 
@Service
public class FavoriteService {
	
	@Autowired
	private FavoriteRepository fav;

		// Add favorites
		public Favorite AddFav(Favorite f) {
			return fav.save(f);
		}

	// ListAllFav
	public List<Favorite> ListAllFav() {
		return (List<Favorite>) fav.findAll();
	}

	// listByReasons
	public List<Favorite> listByReasons(String reason) {
		return fav.findByReason(reason);
	}

	// listByName (if needed)
	public Favorite listByName(String dealerName) {
		return fav.findByDealerName(dealerName);
	}
	
	//deleteByName (if needed)
	public String deleteByName(String dealerName) {
		fav.deleteById(fav.findByDealerName(dealerName).getDealerId());
		return "Deleted favorite for dealer with name: " + dealerName;
	}

	//updateByName (if needed)
	public Favorite updateByName(String dealerName, Favorite updatedFavorite) {
		Favorite existingFavorite = fav.findByDealerName(dealerName);
		if (existingFavorite != null) {
			existingFavorite.setDealerName(updatedFavorite.getDealerName());
			existingFavorite.setReason(updatedFavorite.getReason());
			// set other fields as needed
			return fav.save(existingFavorite);
		}
		return null;
	}
}
