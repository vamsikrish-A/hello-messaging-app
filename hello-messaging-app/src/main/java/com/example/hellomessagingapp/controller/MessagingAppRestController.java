package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingAppRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/hello/query")
    public String helloWithName(
            @RequestParam(value = "name") String name
    ) {
        return "Hello " + name + " from BridgeLabz";

    }
}
