package org.telran.shop.de.service;

import org.telran.shop.de.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(Long id);

    User create(User user);
}
