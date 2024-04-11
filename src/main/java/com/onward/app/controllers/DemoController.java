package com.onward.app.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// Made by Jack Turk
@RestController
public class DemoController {

    @GetMapping("/")
    public String greet() {
        return "Onward!";
    }

    @GetMapping("/test")
    public String test() {
        return "tested!";
    }
    
    
}
