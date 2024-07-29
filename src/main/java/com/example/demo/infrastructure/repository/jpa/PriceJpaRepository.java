package com.example.demo.infrastructure.repository.jpa;

import com.example.demo.domain.model.price.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PriceJpaRepository extends JpaRepository<Price, Long> {

    @Query(nativeQuery = true,
            value = "SELECT * from Prices p " +
            "WHERE p.product_id = :productId " +
            "AND p.brand_id = :brandId " +
            "AND :applyDate between p.start_date and p.end_date "+
            "ORDER BY p.priority desc limit 1")
    Price findPriceToApply(LocalDateTime applyDate, Long productId, Long brandId);
}
