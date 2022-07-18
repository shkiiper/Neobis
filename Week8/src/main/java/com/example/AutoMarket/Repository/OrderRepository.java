package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}