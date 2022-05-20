package com.example.springmvc.controller;

import com.example.springmvc.dto.in.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController{
    private static final String VIEW_NAME = "PageUser";

    @GetMapping("/form")
    public String initializePage(Model model){
        model.addAttribute("user", new User());
        return VIEW_NAME;
    }

    @PostMapping("/form")
    public String formPost(@Valid User user, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
        }
        model.addAttribute("user", user);
        return VIEW_NAME;
    }
}
