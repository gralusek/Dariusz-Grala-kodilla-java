package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("BER", true);
        airportDataBase.put("LON", true);
        airportDataBase.put("PAR", false);
        airportDataBase.put("NYC", false);
        airportDataBase.put("ROM", true);

        FlightSearch flightSearch = new FlightSearch(airportDataBase);

        try {
            flightSearch.findFlight(new Flight("GGG", "LON"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }


}
