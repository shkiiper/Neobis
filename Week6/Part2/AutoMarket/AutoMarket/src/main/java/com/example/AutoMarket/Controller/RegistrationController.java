package com.example.AutoMarket.Controller;

import com.example.AutoMarket.DTO.RegistrationDTO;
import com.example.AutoMarket.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/registration")
public class RegistrationController {
    @Autowired
    private UserService userService;

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

