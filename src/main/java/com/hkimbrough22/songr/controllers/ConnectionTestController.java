package com.hkimbrough22.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConnectionTestController {
    @GetMapping("/hello")
    public String helloWorldMethod(){
        System.out.println("Hello World!");
        return "hello";
    }
}
