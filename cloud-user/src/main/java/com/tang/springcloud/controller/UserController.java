package com.tang.springcloud.controller;

import com.tang.springcloud.entity.User;
import com.tang.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }
}
