package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> flightsMap;

    public FlightSearch(Map<String, Boolean> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (flightsMap.getOrDefault(flight.getArrivalAirport(), false) && flightsMap.getOrDefault(flight.getDepatureAirport(), false)) {
            return true;
        } else {
            throw new RouteNotFoundException("Arrival Airport not found!");
        }

    }
}
