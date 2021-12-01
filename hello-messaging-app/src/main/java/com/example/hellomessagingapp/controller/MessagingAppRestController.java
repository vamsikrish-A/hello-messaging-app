package com.example.hellomessagingapp.controller;

import org.springframework.http.MediaType;
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

    /**
     *  posting data to server using json
     *  curl -X POST http://localhost:8080/hello/post -H 'Cache-control: no-choice' -H 'content-type: application/json'
     *  -d '{"firstName":"Mark", "lastName":"Taylor"}'
     * @param requestUserDetails
     * @return
     */
    @PostMapping(value = "/hello/post", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String helloWithPostMethod(@RequestBody UserDTO requestUserDetails) {
        return "Hello "+requestUserDetails.getFirstName()+ " " +requestUserDetails.getLastName()+ " from brigdgelabz";
    }
}
