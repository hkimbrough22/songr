package com.hkimbrough22.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SplashController {
    @GetMapping("/")
    public String splashPage(Model m) {
        m.addAttribute("title", "Songr");
        m.addAttribute("greeting", "Welcome to Songr!");
        m.addAttribute("imageURL", "/img/icon.png");
        return "index.html";
    }

    @GetMapping("/hello")
    public String helloWorldMethod(){
        System.out.println("Hello World!");
        return "hello.html";
    }

    @GetMapping("/capitalize/{textToCapitalize}")
    public String capitalizeInput(Model m, @PathVariable String textToCapitalize){
        String capitalizedText = textToCapitalize.toUpperCase();
        m.addAttribute("CapText", capitalizedText);
        System.out.println("Capitalized!");
        return "capitalize.html";
    }
}
