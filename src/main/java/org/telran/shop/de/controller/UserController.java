package org.telran.shop.de.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telran.shop.de.entity.User;
import org.telran.shop.de.service.UserService;

import java.util.List;

// http://localhost:8080

@RestController
@RequestMapping("/api/users") // http://localhost:8080/api/users
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}
