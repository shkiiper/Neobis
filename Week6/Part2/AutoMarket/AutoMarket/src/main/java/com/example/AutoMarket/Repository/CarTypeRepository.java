package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTypeRepository extends JpaRepository<CarType, Long> {
}