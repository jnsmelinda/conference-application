package com.example.conference.controller;

import com.example.conference.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Melcsi") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Ivanov") String lastName,
                        @RequestParam(value = "age", defaultValue = "29") int age) {
        return User.builder()
            .firstname(firstName)
            .lastname(lastName)
            .age(age)
            .build();
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        System.out.println(user);

        return user;
    }
}
