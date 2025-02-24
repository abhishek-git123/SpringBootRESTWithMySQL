package com.javaguides.springboot.controller;

import com.javaguides.springboot.entity.User;
import com.javaguides.springboot.exception.NotFoundException;
import com.javaguides.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //build get user by id REST API

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable("id") Long userId) throws Exception {
        User userById = userService.getUserById(userId);
        if(userById == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userById, HttpStatus.OK);
    }

    @GetMapping("usersList")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
