package com.example.authopractice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello World!</h1>";
    }
}
