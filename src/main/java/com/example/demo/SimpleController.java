package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Value("${custom.message}")
    private String c_message;

    @GetMapping("/hello")
    public String hello() {
        return c_message;
    }
}
