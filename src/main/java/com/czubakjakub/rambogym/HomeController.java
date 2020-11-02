package com.czubakjakub.rambogym;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHomePage(){
        return "Hello world!";
    }
}
