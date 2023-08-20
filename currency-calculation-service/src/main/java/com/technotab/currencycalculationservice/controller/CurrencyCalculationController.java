package com.technotab.currencycalculationservice.controller;


import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technotab.currencycalculationservice.model.CalculatedAmount;

@RestController
public class CurrencyCalculationController {
    

@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
public CalculatedAmount CalculatedAmount(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
    
    
    return new CalculatedAmount(100L, from, to, BigDecimal.ONE, quantity, quantity, 8100);
}

}
