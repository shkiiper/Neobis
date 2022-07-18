package com.example.AutoMarket.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/admin")
    public String helooAdmin(){
        return "Hello Admin!";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
