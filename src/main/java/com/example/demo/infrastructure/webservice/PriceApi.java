package com.example.demo.infrastructure.webservice;

import com.example.demo.application.dto.price.PriceResponseDto;
import com.example.demo.application.service.PriceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/prices")
@Tag(name = "Prices", description = "Prices API")
public class PriceApi {

    @Autowired
    private PriceService priceService;

    @Operation(summary = "priceToApply")
    @GetMapping("/toapply/{date}/{productId}/{brandId}")
    public ResponseEntity<PriceResponseDto> getPriceToApply(
            @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") @PathVariable(value = "date") LocalDateTime applyDate,
            @PathVariable(value = "productId") Long productId,
            @PathVariable(value = "brandId") Long brandId) {
        return new ResponseEntity<>(priceService.getPriceToApply(applyDate,productId,brandId), HttpStatus.OK);
    }
}
