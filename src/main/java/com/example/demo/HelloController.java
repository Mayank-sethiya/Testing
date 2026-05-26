package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/users")
    public String sayHello1(){
        return "Welcome to spring boot ";
    }

    @GetMapping("/myHello")
    public String myMessage(){
        return "Hello from Akash";
    }

}
