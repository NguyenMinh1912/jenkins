package com.minhnc.jenkinmavenbuild.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAPI {

    @GetMapping
    public String helloWorld(){
        return "Hello world";
    }

}
