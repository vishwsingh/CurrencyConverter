package com.example.CurrencyConverterAPI.controller;

import com.example.CurrencyConverterAPI.model.CurrencyConverter;
import com.example.CurrencyConverterAPI.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CurrencyController {
    @Autowired
    CurrencyConverterService currencyConverterService;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConverter getCurrencyExchange(@PathVariable String from, @PathVariable String to) {
            return currencyConverterService.getCurrencyExchange(from, to);
    }

}
