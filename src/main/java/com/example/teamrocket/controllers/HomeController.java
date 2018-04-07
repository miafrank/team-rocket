package com.example.teamrocket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    public String homeController(Model model) {
        model.addAttribute("title", "welcome home");
        return "home";
    }
}
