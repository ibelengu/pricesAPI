package com.example.demo.domain.model.price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository {
    Price getPriceToApply(LocalDateTime applyDate, Long productId, Long brandId);
}
