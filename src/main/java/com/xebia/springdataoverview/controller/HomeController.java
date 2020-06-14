package com.xebia.springdataoverview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homeController()
    {
        return "<h1> Welcome  </h1>";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "<h1> Welcome Admin </h1>";
    }

    @GetMapping("/user")
    public String user()
    {
        return "<h1> Welcome User </h1>";
    }




}
