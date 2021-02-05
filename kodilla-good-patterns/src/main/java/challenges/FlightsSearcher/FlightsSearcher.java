package challenges.FlightsSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightsSearcher {

    public Set<Flight> searchDepaturesFromCity(Database database, String depatureCity) {

        Set<Flight> searchDepaturesFromCity = database.getDatabase().stream()
                .filter(Flight -> Flight.getDepatureAirport().equals(depatureCity))
                .collect(Collectors.toSet());

        System.out.println("Flight depaturing from selected city: " + depatureCity);

        return searchDepaturesFromCity;
    }

    //zmienić na return Set

    public void searchArrivalsFromCity(Database database, String arrivalCity) {

        Set<Flight> searchArrivalsFromCity = database.getDatabase().stream()
                .filter(Flight -> Flight.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toSet());

        System.out.println("Flight arriving to selected city: " + arrivalCity);
        searchArrivalsFromCity.forEach(Flight -> System.out.println(Flight.getDepatureAirport()));

    }

    public void searchConnectingFlight(Database database, ConnectingFlight connectingFlight) {

        Set<Flight> searchConnectingFlight = database.getDatabase().stream()
                .filter(Flight -> Flight.getDepatureAirport().equals(connectingFlight.getFrom()))
                .filter(Flight -> Flight.getArrivalAirport().equals(connectingFlight.getTrough()))
                .collect(Collectors.toSet());

        Set<Flight> searchFinalDestination = database.getDatabase().stream()
                .filter(Flight -> Flight.getDepatureAirport().equals(connectingFlight.getTrough()))
                .filter(Flight -> Flight.getArrivalAirport().equals(connectingFlight.getTo()))
                .collect(Collectors.toSet());

        Set<Flight> finalList = Stream.concat(searchConnectingFlight.stream(), searchFinalDestination.stream()).collect(Collectors.toSet());

        System.out.println("Searching Connecting Flight from: " + connectingFlight.getFrom()
                + " trough: " + connectingFlight.getTrough() + " to: " + connectingFlight.getTo());
        System.out.println(finalList);
        //searchConnectingFlight.forEach(Flight -> System.out.println(Flight));
        //searchFinalDestination.forEach(Flight -> System.out.println(Flight));
    }

    public List<List<Flight>> searchConnectingFlight2(Database database, Flight flight) {

        Set<Flight> searchConnectingFlight = database.getDatabase().stream()
                .filter(Flight -> Flight.getDepatureAirport().equals(flight.getDepatureAirport()))
                .collect(Collectors.toSet());

        Set<Flight> searchArrivalsFromCity = database.getDatabase().stream()
                .filter(Flight -> Flight.getArrivalAirport().equals(flight.getArrivalAirport()))
                .collect(Collectors.toSet());


        List<List<Flight>> finalList = searchConnectingFlight.stream()
                .map(flight1 -> {
                    List<Flight> notYetFinalList = searchArrivalsFromCity.stream()
                            .filter(flight2 -> flight1.getArrivalAirport().equals(flight2.getDepatureAirport()))
                            .collect(Collectors.toList());
                    notYetFinalList.add(0, flight1);
                    return notYetFinalList;
                })
                .collect(Collectors.toList());

        return finalList;

    }
}
