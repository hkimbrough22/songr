package com.hkimbrough22.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class CapitalizeController {
    @GetMapping("/capitalize/{textToCapitalize}")
    public String capitalizeInput(Model m, @PathVariable String textToCapitalize){
        String capitalizedText = textToCapitalize.toUpperCase();
        m.addAttribute("CapText", capitalizedText);
        System.out.println("Capitalized!");
        return "capitalize/capitalize";
    }

}
