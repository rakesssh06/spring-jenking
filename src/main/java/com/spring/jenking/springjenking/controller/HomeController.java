package com.spring.jenking.springjenking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
    @RequestMapping("home")
    public String getHome(){
        return "Jenking Working   ....";
    }

}
