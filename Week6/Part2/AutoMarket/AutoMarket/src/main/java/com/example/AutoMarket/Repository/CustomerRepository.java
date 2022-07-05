package com.example.AutoMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AutoMarket.Model.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}