package com.example.AutoMarket.Service;

import com.example.AutoMarket.DTO.RegistrationDTO;
import com.example.AutoMarket.Entity.Role;
import com.example.AutoMarket.Entity.Users;
import com.example.AutoMarket.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;


@Service
public class UserServiceImplements implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;


//    @Override
//    public Users save(RegistrationDTO userRegistrationDto) {
//        Users user = new Users(userRegistrationDto.getUserName(),
//                passwordEncoder.encode(userRegistrationDto.getPassword()));
//        user.setRoles(Collections.singleton(new Role(1L,"ROLE_USER") ));
//        return userRepository.save(user);
//    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users user = userRepository.findByUserName(userName);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password!");
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),user.getRoles());
    }


    private Collection <? extends GrantedAuthority> mapRolesToAuthorities (Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public Users save(RegistrationDTO RegistrationDTO) {
        return null;
    }
}