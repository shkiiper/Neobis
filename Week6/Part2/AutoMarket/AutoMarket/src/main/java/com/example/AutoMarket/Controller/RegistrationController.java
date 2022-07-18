package com.example.AutoMarket.Controller;

import com.example.AutoMarket.Service.UserService;
import com.example.AutoMarket.DTO.RegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/registration")
public class RegistrationController {

    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userForm")
    public RegistrationDTO RegistrationDTO(){
        return new RegistrationDTO();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser (@ModelAttribute ("userForm")RegistrationDTO RegistrationDTO){
        userService.save(RegistrationDTO);
        return "redirect:/registration?success";
    }

}

