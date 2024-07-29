package com.example.demo.application.dto.price;

import com.example.demo.domain.model.price.Price;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceDtoMapper {

    default PriceResponseDto fromEntity(Price entity) {
        if (entity == null) {
            return null;
        }
        var priceResponseDto = new PriceResponseDto();
        priceResponseDto.setProductId(entity.getProductId());
        priceResponseDto.setBrandId(entity.getBrandId());
        priceResponseDto.setPriceList(entity.getPriceList());
        priceResponseDto.setStartDate(entity.getStartDate());
        priceResponseDto.setEndDate(entity.getEndDate());
        priceResponseDto.setPrice(entity.getPrice());
        return priceResponseDto;
    }
}
