package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUserName (String userName);
}
