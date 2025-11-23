package com.dealer.dealer_favorites_management.service;

import com.dealer.dealer_favorites_management.dao.UserRepository;
import com.dealer.dealer_favorites_management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(String username, String password, String role) {
        User user = new User(username, password, role);
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
