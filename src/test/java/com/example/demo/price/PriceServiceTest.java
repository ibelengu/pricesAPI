package com.example.demo.price;

import com.example.demo.application.dto.price.PriceResponseDto;
import com.example.demo.application.service.PriceService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;

@SpringBootTest
public class PriceServiceTest {

    @Autowired
    private PriceService priceService;

    @Test
    void Test1(){
        LocalDateTime date1 = LocalDateTime.of(2020, Month.JUNE, 14, 10, 00, 00);
        PriceResponseDto price = priceService.getPriceToApply(date1, 35455L, 1L);
        Assert.assertNotNull(price);
        Assert.assertEquals(Double.valueOf(35.50), price.getPrice());
    }

    @Test
    void Test2(){
        LocalDateTime date2 = LocalDateTime.of(2020, Month.JUNE, 14, 16, 00, 00);
        PriceResponseDto price = priceService.getPriceToApply(date2, 35455L, 1L);
        Assert.assertNotNull(price);
        Assert.assertEquals(Double.valueOf(25.45), price.getPrice());
    }

    @Test
    void Test3(){
        LocalDateTime date3 = LocalDateTime.of(2020, Month.JUNE, 14, 21, 00, 00);
        PriceResponseDto price = priceService.getPriceToApply(date3, 35455L, 1L);
        Assert.assertNotNull(price);
        Assert.assertEquals(Double.valueOf(35.50), price.getPrice());
    }

    @Test
    void Test4() throws ParseException {
        LocalDateTime date4 = LocalDateTime.of(2020, Month.JUNE, 15, 10, 00, 00);
        PriceResponseDto price = priceService.getPriceToApply(date4, 35455L, 1L);
        Assert.assertNotNull(price);
        Assert.assertEquals(Double.valueOf(30.50), price.getPrice());
    }

    @Test
    void Test5(){
        LocalDateTime date5 = LocalDateTime.of(2020, Month.JUNE, 16, 21, 00, 00);
        PriceResponseDto price = priceService.getPriceToApply(date5, 35455L, 1L);
        Assert.assertNotNull(price);
        Assert.assertEquals(Double.valueOf(38.95), price.getPrice());
    }
}
