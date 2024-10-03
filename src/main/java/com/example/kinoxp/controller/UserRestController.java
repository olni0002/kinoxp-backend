package com.example.kinoxp.controller;


import com.example.kinoxp.model.User;
import com.example.kinoxp.service.ApiServiceGetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserRestController {

    @Autowired
    ApiServiceGetUser apiServiceGetUser;

    @GetMapping("/users")
    public List<User> getUser() {
        return apiServiceGetUser.getUsers();
    }
}
