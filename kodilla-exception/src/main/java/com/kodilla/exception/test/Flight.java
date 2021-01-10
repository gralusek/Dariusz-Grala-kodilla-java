package com.kodilla.exception.test;

public class Flight {

    private String depatureAirport;
    private String arrivalAirport;

    public Flight(String depatureAirport, String arrivalAirport) {
        this.depatureAirport = depatureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepatureAirport() {
        return depatureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
