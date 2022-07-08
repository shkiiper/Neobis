package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}