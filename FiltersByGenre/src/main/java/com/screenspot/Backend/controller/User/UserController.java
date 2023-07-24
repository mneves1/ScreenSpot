package com.screenspot.Backend.controller.User;

import com.screenspot.Backend.entiry.user.User;
import com.screenspot.Backend.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/users/{id}")
    public User createUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id); // set the user id from path variable
        return userService.createUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }
}
