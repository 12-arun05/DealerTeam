package com.dealer.dealer_favorites_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dealer.dealer_favorites_management.model.Dealer;
import com.dealer.dealer_favorites_management.service.DealerService;

@RestController
@RequestMapping("/dealers")
public class DealerController {

	@Autowired
	private DealerService dealerService;

	// deleteByName
	@DeleteMapping("/delete/{name}")
	public String deleteByName(@PathVariable String name) {
		return dealerService.deleteByName(name);
	}

	// updateByName
	@PutMapping("/update/{name}")
	public Dealer updateByName(@PathVariable String name, @RequestBody Dealer dealer) {
		return dealerService.updateByName(name, dealer);
	}

	// listByName
	@GetMapping("/by-name/{name}")
	public Dealer listByName(@PathVariable String name) {
		return dealerService.listByName(name);
	}
}
