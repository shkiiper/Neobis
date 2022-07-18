package com.example.AutoMarket.Service;

import com.example.AutoMarket.DTO.RegistrationDTO;
import com.example.AutoMarket.Entity.Role;
import com.example.AutoMarket.Entity.User;
import com.example.AutoMarket.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;


@Service
public class UserServiceImplements implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private UserRepository userRepository;

    @Autowired
    public UserServiceImplements(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }


    @Override
    public User save(RegistrationDTO userRegistrationDto) {
        User user = new User(userRegistrationDto.getUserName(),
                bCryptPasswordEncoder.encode(userRegistrationDto.getPassword()));
        user.setRoles(Collections.singleton(new Role(1L,"ROLE_USER") ));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password!");
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),user.getRoles());
    }


    private Collection <? extends GrantedAuthority> mapRolesToAuthorities (Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}