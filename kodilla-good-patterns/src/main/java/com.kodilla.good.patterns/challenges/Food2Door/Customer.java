package com.kodilla.good.patterns.challenges.Food2Door;

public class Customer {
    private String name;
    private String surname;
    private String city;
    private String street;
    private int houseNumber;
    private int apartmentNumber;


    public Customer(String name, String surname, String city, String street, int houseNumber, int apartmentNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return city + street + houseNumber + apartmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (houseNumber != customer.houseNumber) return false;
        if (apartmentNumber != customer.apartmentNumber) return false;
        if (!name.equals(customer.name)) return false;
        if (!surname.equals(customer.surname)) return false;
        if (!city.equals(customer.city)) return false;
        return street.equals(customer.street);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + houseNumber;
        return result;
    }

    @Override
    public String toString() {
        return  "Name:'" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", City='" + city + '\'' +
                ", Street='" + street + '\'' +
                ", House number=" + houseNumber +
                ", Apartment number=" + apartmentNumber;
    }
}
