package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}