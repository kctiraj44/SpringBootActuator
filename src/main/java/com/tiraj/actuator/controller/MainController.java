package com.tiraj.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String getTest(){
        return  "*---This is a spring boot application--*";
    }




}
