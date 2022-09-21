package com.shaker.conferenceMVC.controller;

import com.shaker.conferenceMVC.model.Registeration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterationController {

    @GetMapping("/registeration")
    public String getRegisteration(@ModelAttribute("registeration") Registeration registration){
        Registeration registeration1 = registration;
        registeration1.setName("Ahmed");
        return "registeration";
    }

    @PostMapping("/registeration")
    public String addRegisteration(@Valid  @ModelAttribute("registeration") Registeration registration,
                                   BindingResult result){
        if (result.hasErrors()){
            System.out.println("Error!!!!!!!!: ");
            return "registeration";
        }
        System.out.println("Registeration: " + registration.getName());
        return "redirect:registeration";
    }



}
