package org.telran.shop.de.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.shop.de.entity.User;
import org.telran.shop.de.repository.UserJpaRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserJpaRepository jpaRepository;

    @Override
    public List<User> getAll() {
        return jpaRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return jpaRepository.findById(id).get();
    }

    @Override
    public User create(User user) {
        return jpaRepository.save(user);
    }
}
