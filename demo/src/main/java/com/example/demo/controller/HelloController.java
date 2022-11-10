package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController{

    @RequestMapping("/hello")
    public String method1() {
        return "hello world";
    }

}