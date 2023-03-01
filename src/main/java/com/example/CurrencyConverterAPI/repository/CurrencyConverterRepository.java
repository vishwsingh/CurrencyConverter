package com.example.CurrencyConverterAPI.repository;

import com.example.CurrencyConverterAPI.model.CurrencyConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyConverterRepository extends JpaRepository<CurrencyConverter, Integer> {

    CurrencyConverter findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);

}
