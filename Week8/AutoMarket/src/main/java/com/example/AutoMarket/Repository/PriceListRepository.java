package com.example.AutoMarket.Repository;

import com.example.AutoMarket.Entity.PriceList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceListRepository extends JpaRepository<PriceList, Long> {
}
