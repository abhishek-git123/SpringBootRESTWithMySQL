package com.javaguides.springboot.service.impl;

import com.javaguides.springboot.entity.User;
import com.javaguides.springboot.repository.UserRepository;
import com.javaguides.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
