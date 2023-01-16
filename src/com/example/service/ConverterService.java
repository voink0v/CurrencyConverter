package com.example.service;

import com.example.entity.Valute;
import repository.ValuteRepository;

import java.math.BigDecimal;

public class ConverterService {


    private ValuteRepository repository;

    public ConverterService(ValuteRepository repository) {
        this.repository = repository;

    }

    public BigDecimal convert(String charCodeIn, BigDecimal summa, String charCodeTo) {
        Valute valuteFrom = repository.getByCodeDefault(charCodeIn);
        Valute valuteTo = repository.getByCodeDefault(charCodeTo);

        return summa.divide(BigDecimal.valueOf(valuteFrom.getNominal())).multiply(valuteFrom.getValue())
                .divide(valuteTo.getValue()).multiply(BigDecimal.valueOf(valuteFrom.getNominal()));

    }

}
