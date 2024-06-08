package com.ram.pallerla.springbootrestdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World :)";
    }

    @GetMapping(path = "/bye")
    public String bye(){
        return "See you soon :(";
    }


}
