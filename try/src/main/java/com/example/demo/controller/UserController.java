package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public List<User> findAll(){
        return userService.findAll();
    }


    @GetMapping(value="/users/{id}")
    //@RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @PostMapping(value= "/users/add")
    public Boolean addNewUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("status") Integer status){
        return userService.addNewUser(name, email, password,status);
    }

    @GetMapping(value="/users/search")
    public List<User> findByStatus(@RequestParam("status") Integer status){
        return userService.findByStatus(status);
    }


}
