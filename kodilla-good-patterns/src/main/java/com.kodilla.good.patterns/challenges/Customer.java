package com.kodilla.good.patterns.challenges;

public class Customer {
    private String name;
    private String surname;
    private String city;
    private String street;
    private int houseNumber;
    private int apartamentNumber;


    public Customer(String name, String surname, String city, String street, int houseNumber, int apartamentNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartamentNumber = apartamentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return city + street + houseNumber + apartamentNumber;
    }
}
