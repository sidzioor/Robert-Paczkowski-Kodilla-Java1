package com.kodilla.good.patterns.challenges.flights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Airports {
    private HashMap<String, List<String>> locationsOfAirports = new HashMap<>();

    public HashMap<String, List<String>> addConnectionsBetweenAirports() {
        List<String> locationsOfFlightsFromWarszawa = Arrays.asList("Olsztyn", "Wroclaw", "Krakow", "Gdansk");
        List<String> locationsOfFlightsFromGdansk = Arrays.asList("Warszawa", "Krakow");
        List<String> locationsOfFlightsFromWroclaw = Arrays.asList("Warszawa", "Gdansk");
        List<String> locationsOfFlightsFromKrakow = Arrays.asList("Warszawa", "Olsztyn");
        List<String> locationsOfFlightsFromOlsztyn = Arrays.asList("Warszawa", "Wroclaw");
        locationsOfAirports.put("Olsztyn", locationsOfFlightsFromOlsztyn);
        locationsOfAirports.put("Warszawa", locationsOfFlightsFromWarszawa);
        locationsOfAirports.put("Krakow", locationsOfFlightsFromKrakow);
        locationsOfAirports.put("Wroclaw", locationsOfFlightsFromWroclaw);
        locationsOfAirports.put("Gdansk", locationsOfFlightsFromGdansk);
        return new HashMap<>(locationsOfAirports);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airports)) return false;

        Airports airports = (Airports) o;

        return locationsOfAirports.equals(airports.locationsOfAirports);
    }

    @Override
    public int hashCode() {
        return locationsOfAirports.hashCode();
    }
}

