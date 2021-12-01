package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingAppRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
