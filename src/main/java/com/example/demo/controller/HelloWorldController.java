package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping("")
    public String helloWorld(){
        return "Hello World!";
    }
    @GetMapping("{name}")
    public String sayHello(@PathVariable String name){
        return "Hello! " + name;
    }
}
