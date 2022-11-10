package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String method1() {
        return "hello world";
    }

}