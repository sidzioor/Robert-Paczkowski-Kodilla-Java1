package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleInCountry;

    public Country(BigDecimal peopleInCountry) {
        this.peopleInCountry = peopleInCountry;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleInCountry;
    }
}
