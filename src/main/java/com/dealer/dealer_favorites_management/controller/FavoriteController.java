package com.dealer.dealer_favorites_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dealer.dealer_favorites_management.model.Favorite;
import com.dealer.dealer_favorites_management.service.FavoriteService;
import java.util.List;


@RestController
@RequestMapping("/favorites")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;

	// ListAllFav
	@GetMapping("/all")
	public List<Favorite> listAllFav() {
		return favoriteService.ListAllFav();
	}

	// listByName (if needed)
	@GetMapping("/by-name/{dealerName}")
	public Favorite listByName(@PathVariable String dealerName) {
		return favoriteService.listByName(dealerName);
	}

	// listByReasons
	@GetMapping("/by-reason/{reason}")
	public List<Favorite> listByReasons(@PathVariable String reason) {
		return favoriteService.listByReasons(reason);
	}

	// AddFav
	@PostMapping("/add")
	public Favorite addFav(@RequestBody Favorite favorite) {
		return favoriteService.AddFav(favorite);
	}

	//deleteByName (if needed)
	@DeleteMapping("/delete/{dealerName}")
	public String deleteByName(@PathVariable String dealerName) {
		return favoriteService.deleteByName(dealerName);
	}
}
