package com.example.SpringRestAssignment.controller;

import com.example.SpringRestAssignment.bean.User;
import com.example.SpringRestAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getAllUser")
    List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{userid}")
    User getUserById(@PathVariable("userid") int userid) {
        return userService.getUserById(userid);
    }

    @GetMapping("/getUserByName/{username}")
    User getUserByName(@PathVariable("username") String name) {
        return userService.getUserByName(name);
    }

    @PutMapping("/updateUser")
    User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser")
    void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }

    @DeleteMapping("/deleteUserById/{userid}")
    void deleteUserById(@PathVariable("userid") int userId) {
        userService.deleteUserById(userId);
    }
}
