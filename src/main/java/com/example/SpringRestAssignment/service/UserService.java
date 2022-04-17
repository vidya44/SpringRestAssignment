package com.example.SpringRestAssignment.service;
import com.example.SpringRestAssignment.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringRestAssignment.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int userId) {
        return userRepository.findById(userId).get();
    }

    public List<User> getAllUser() {
        List<User> li = new ArrayList<>();
        userRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }


}

