package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightTable flightTable = new FlightTable();
        flightTable.showFlightsFrom("Krakow");
        flightTable.showFlightsTo("Gdansk");
        flightTable.showFlightsWithStopover("Gdansk", "Krakow");
    }
}
