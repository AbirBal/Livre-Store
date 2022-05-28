package com.project.livrestore.service;

import com.project.livrestore.model.User;

import java.util.Optional;


public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
