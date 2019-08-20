package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightTable {
    Airports airports = new Airports();

    public void showFlightsFrom(String locationOfAirport) {
        System.out.println("Flight from: " + locationOfAirport);
        airports.addConnectionsBetweenAirports().get(locationOfAirport).stream()
                .forEach(System.out::println);
        System.out.println('\n');
    }
    public void showFlightsTo(String locationOfAirport){
        System.out.println("Flights to: " + locationOfAirport);
        airports.addConnectionsBetweenAirports().entrySet().stream()
                .filter(airport -> airport.getValue().contains(locationOfAirport))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
    public void showFlightsWithStopover(String startLocationAirport, String destinationAirport){
        System.out.println();
        List<String> results1 = airports.addConnectionsBetweenAirports().get(startLocationAirport);
        List<String> results2 =  airports.addConnectionsBetweenAirports().entrySet().stream()
                .filter(airport->airport.getValue().contains(destinationAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        List<String> completeList = new ArrayList<>(results1);
        completeList.addAll(results2);
        System.out.println("Flights from: "+ startLocationAirport + "\nStopover landing: "
                + FindTheNumberOfOccurrences.findNumberOfOccurrences(completeList)+"\n"
                + "Destination airport: "+ destinationAirport);
    }
}
