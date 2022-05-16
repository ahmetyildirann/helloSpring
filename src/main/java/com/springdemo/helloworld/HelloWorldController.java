package com.springdemo.helloworld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld(){
        return "Helloooo Spring Boot";
    }

    @RequestMapping("/goodbye-spring")
    public String message(){
        return "good bye spring boot ";
    }
}
