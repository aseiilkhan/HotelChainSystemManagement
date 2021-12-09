package com.springboot.hotels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String getHome(Model model) {
        return "Home";
    }

    @RequestMapping("/about")
    public String getAbout(Model model) {
        return "About";
    }

    @RequestMapping("/contact")
    public String getContact(Model model) {
        return "Contact";
    }

    @RequestMapping("/login")
    public String getLogin(Model model) {
        return "Login";
    }

    @RequestMapping("/registration")
    public String getRegistration(Model model) {
        return "Registration";
    }

    @RequestMapping("/guest")
    public String getGuest(Model model) {
        return "Guest";
    }
}
