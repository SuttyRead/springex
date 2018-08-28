package com.ua.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/users")
    public String getUsersPage(ModelMap model){
        model.addAttribute("userName", "Roman");
        return "users";
    }

}
