package com.example.springmvc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    private static final String VIEW_NAME = "PageHome";

    @GetMapping()
    public ModelAndView initializePage(){
        ModelMap model = new ModelMap();
        return new ModelAndView(VIEW_NAME,model);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String init() {
        return "Hello world";
    }
}
