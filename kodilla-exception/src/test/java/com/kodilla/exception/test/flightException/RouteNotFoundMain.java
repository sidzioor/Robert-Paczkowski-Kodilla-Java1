package com.kodilla.exception.test.flightException;

public class RouteNotFoundMain {
    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa Okecie Airport", "Doncaster/Sheffield Airport");
        AirportFinder airports = new AirportFinder();

        try{
            airports.findFlight(flight);
        }catch(RouteNotFoundException e){
            System.out.println("Sorry we have a problem: "+ e);
        }finally{
            System.out.println("Thanks for using our app.");
        }
    }
}
