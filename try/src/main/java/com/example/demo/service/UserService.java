package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    List<User> findByStatus(Integer status);

    Boolean addNewUser(String name, String email, String password, Integer status);
}
