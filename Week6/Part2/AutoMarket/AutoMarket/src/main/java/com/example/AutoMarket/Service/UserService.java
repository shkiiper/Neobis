package com.example.AutoMarket.Service;

import com.example.AutoMarket.Entity.Users;

import com.example.AutoMarket.DTO.RegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    Users save(RegistrationDTO RegistrationDTO);
}
