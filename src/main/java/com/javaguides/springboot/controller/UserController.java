package com.javaguides.springboot.controller;

import com.javaguides.springboot.entity.User;
import com.javaguides.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api")
public class UserController {
    private UserService userService;

    //build Create User REST API

    @PostMapping("users")
    public ResponseEntity<User> createUser(@RequestBody  User user){
        User savedUser =  userService.createUser(user);
        return new ResponseEntity<>(savedUser , HttpStatus.CREATED);
    }
}
