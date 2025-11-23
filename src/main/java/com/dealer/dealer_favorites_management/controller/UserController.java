package com.dealer.dealer_favorites_management.controller;

import com.dealer.dealer_favorites_management.model.User;
import com.dealer.dealer_favorites_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getUsername(), user.getPassword(), user.getRole());
    }
}
