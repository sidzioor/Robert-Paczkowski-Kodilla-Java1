package com.kodilla.exception.test.flightException;

import java.util.HashMap;
import java.util.Map;

public class AirportFinder {
    public void findFlight(Flight flight)throws RouteNotFoundException {
        Map<String, Boolean> airportsToLand = new HashMap<>();

        if(airportsToLand.containsKey(flight.getArrivalAirport())){
            if(airportsToLand.get(flight.getArrivalAirport()).booleanValue()){
                System.out.println("You can land on "+ flight.getArrivalAirport());
            }else
                System.out.println("You can't land on" + flight.getArrivalAirport());
        }else{
            throw new RouteNotFoundException("Arrival airport not exist");
        }
    }
}
