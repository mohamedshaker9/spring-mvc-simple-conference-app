package com.shaker.conferenceMVC.controller;

import com.shaker.conferenceMVC.model.Registeration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterationController {

    @GetMapping("/registeration")
    public String getRegisteration(@ModelAttribute("registeration") Registeration registration){
        Registeration registeration1 = registration;
        registeration1.setName("Ahmed");
        return "registeration";
    }

    @PostMapping("/registeration")
    public String addRegisteration(@ModelAttribute("registeration") Registeration registration){
        System.out.println("Registeration: " + registration.getName());
        return "redirect:registeration";
    }



}
