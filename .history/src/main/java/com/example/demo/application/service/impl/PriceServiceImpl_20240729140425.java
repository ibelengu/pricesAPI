package com.example.demo.application.service.impl;

import com.example.demo.application.dto.price.PriceDtoMapper;
import com.example.demo.application.dto.price.PriceResponseDto;
import com.example.demo.domain.model.price.PriceRepository;
import com.example.demo.application.service.PriceService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private PriceDtoMapper mapper;

    @Override
    public PriceResponseDto getPriceToApply(LocalDateTime applyDate, Long productId, Long brandId){
        var entity = priceRepository.getPriceToApply(applyDate, productId, brandId);
        if(!Objects.isNull(entity)) {
            return mapper.fromEntity(entity);
        } else {
            throw new EntityNotFoundException("Not price found");
        }
    }
}
