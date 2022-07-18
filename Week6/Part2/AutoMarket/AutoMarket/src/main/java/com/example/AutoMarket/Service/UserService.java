package com.example.AutoMarket.Service;

import com.example.AutoMarket.Entity.User;

import com.example.AutoMarket.DTO.RegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User save(RegistrationDTO RegistrationDTO);
}
