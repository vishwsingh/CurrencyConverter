package com.example.CurrencyConverterAPI.service;

import com.example.CurrencyConverterAPI.model.CurrencyConverter;
import com.example.CurrencyConverterAPI.repository.CurrencyConverterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterService {

    @Autowired
    CurrencyConverterRepository currencyConverterRepository;

    @Value("${server.port}")
    private String port;
    public CurrencyConverter getCurrencyExchange(String from, String to) {
        CurrencyConverter currencyConverter = currencyConverterRepository.findByCurrencyFromAndCurrencyTo(from, to);
        currencyConverter.setPort(Integer.parseInt(port));
        return currencyConverter;
    }
}
