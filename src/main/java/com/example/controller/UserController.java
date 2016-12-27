package com.example.controller;

import com.example.entity.Users;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.sql.*;

@RestController(value = "users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Users> findAllUsers() {
        return userRepository.findAll();
    }


    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String addNewUser(@RequestBody Users user) {
        Users user1 = new Users();
        user1.setLogin(user.getLogin());
        user1.setPassword(user.getPassword());
        user1.setRank(user.getRank());
        userRepository.save(user1);
        return "users";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@RequestBody Users user) {
        Users user1 = userRepository.findOne(user.getIduser());
        userRepository.delete(user1);
        return "users";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editUser(@RequestBody Users user) {
        Users user1 = userRepository.findOne(user.getIduser());
        user1.setPassword(user.getPassword());
        user1.setRank(user.getRank());
        userRepository.save(user1);
        return "users";
    }

}
