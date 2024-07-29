package com.example.demo.infrastructure.repository;

import com.example.demo.domain.model.price.Price;
import com.example.demo.domain.model.price.PriceRepository;
import com.example.demo.infrastructure.repository.jpa.PriceJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class PriceRepositoryImpl implements PriceRepository {

    @Autowired
    private PriceJpaRepository priceJpaRepository;

    @Override
    public Price getPriceToApply(LocalDateTime applyDate, Long productId, Long brandId) {
        return priceJpaRepository.findPriceToApply(applyDate, productId, brandId);
    }
}
