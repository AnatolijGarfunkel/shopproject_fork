package org.telran.shop.de.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/search")
    public User getByName(@RequestParam(name = "name") String name) {
        return userService.getByName(name);
    }

    @PostMapping("/equals_passwords")
    public List<User> getWithEqualsPassword(@RequestBody String password) {
        return userService.getWithEqualsPasswords(password);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
