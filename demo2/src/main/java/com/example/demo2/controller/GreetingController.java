package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        // new comments
        return "Hello, I am returned from /hello api";
    }

    @GetMapping("/")
    String home() {
        // test
        return "Hello World! -- HOME";
    }
}
