package com.hkimbrough22.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SplashController {
    @GetMapping("/")
    public String splashPage(Model m) {
        m.addAttribute("title", "Songr");
        m.addAttribute("greeting", "Welcome to Songr!");
        m.addAttribute("imageURL", "/img/icon.png");
        return "index";
    }
}
