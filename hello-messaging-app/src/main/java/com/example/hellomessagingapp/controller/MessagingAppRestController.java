package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/hello/param/{name}")
    public String helloWithParamName(@PathVariable String name) {
        return "Hello " +name +" from bridgelabz";
    }
}
