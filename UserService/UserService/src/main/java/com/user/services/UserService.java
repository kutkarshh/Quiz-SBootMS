package com.user.services;

import java.util.List;

import com.user.entities.User;

public interface UserService {
    User registerUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User getUserByUsername(String username);
}
