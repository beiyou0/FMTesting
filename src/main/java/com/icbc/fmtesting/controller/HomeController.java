package com.icbc.fmtesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @RequestMapping(value = "/home")
    public String home() {
        System.out.println("redirect to home page!");
        return "Hello World!";
    }
}