package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {

        return "Hello, I am returned from /hello api";
    }

    @RequestMapping("/")
    String home() {
        return "Hello World! -- HOME";
    }
}
