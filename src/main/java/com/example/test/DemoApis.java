package com.example.test;

import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DemoApis {

    @GetMapping("/hii")
    public String hi(){
        System.out.println("hii");
        return "hi"
                ;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hw")
    public String hw(){
        return "Hello World";
    }
}
