package com.example.entity;

import java.math.BigDecimal;

public class Valute {
    private Integer numCode;
    private String charCode;

    public Valute() {
    }

    public Valute(Integer numCode, String charCode, Integer nominal, String name, BigDecimal value) {
        this.numCode = numCode;
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
    }

    public void setNumCode(Integer numCode) {
        this.numCode = numCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    private Integer nominal;
    private String name;

    public Integer getNumCode() {
        return numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public Integer getNominal() {
        return nominal;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    private BigDecimal value;
}


