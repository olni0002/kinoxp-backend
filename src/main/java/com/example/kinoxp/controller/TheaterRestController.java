package com.example.kinoxp.controller;

import com.example.kinoxp.model.Theater;
import com.example.kinoxp.service.ApiServiceGetTheater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TheaterRestController {

    @Autowired
    ApiServiceGetTheater apiServiceGetTheater;

    @GetMapping("/theater")
    public List<Theater> getTheater(){
        return apiServiceGetTheater.getTheater();
    }
}
