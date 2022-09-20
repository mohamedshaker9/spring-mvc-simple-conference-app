package com.shaker.conferenceMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "greeting message");
        return "greeting";
    }

    @GetMapping("/thymeleaf")
    public String thymeleaf(Map<String, Object> model){
        model.put("message", "thymelead message");
        return "thyme";
    }
}
