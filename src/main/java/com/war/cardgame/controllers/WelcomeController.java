package com.war.cardgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    //Welcome Page
    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }
}
