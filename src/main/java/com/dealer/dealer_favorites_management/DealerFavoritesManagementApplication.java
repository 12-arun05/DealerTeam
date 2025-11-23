package com.dealer.dealer_favorites_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.dealer.dealer_favorites_management.service.UserService;

@SpringBootApplication
public class DealerFavoritesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealerFavoritesManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner initUsers(UserService userService) {
		return args -> {
			// Create admin profiles
			userService.createUser("dealer1", "password1", "ADMIN");
			userService.createUser("dealer2", "password2", "ADMIN");
			// Create customer profiles
			userService.createUser("customer1", "password3", "CUSTOMER");
			userService.createUser("customer2", "password4", "CUSTOMER");
		};
	}
}
