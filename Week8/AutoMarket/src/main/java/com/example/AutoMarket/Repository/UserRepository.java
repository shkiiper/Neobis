package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName (String userName);
}
