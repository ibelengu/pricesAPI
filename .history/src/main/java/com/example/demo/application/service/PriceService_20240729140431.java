package com.example.demo.application.service;

import com.example.demo.application.dto.price.PriceResponseDto;
import java.time.LocalDateTime;

public interface PriceService {

    public PriceResponseDto getPriceToApply(LocalDateTime applyDate, Long productId, Long brandId);

}
