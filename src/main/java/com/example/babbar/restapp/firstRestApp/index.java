package com.example.babbar.restapp.firstRestApp;


import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @RequestMapping("/")
    public String helloFunc() {
        return "Hello World";
    }


}
