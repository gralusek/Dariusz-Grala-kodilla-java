package challenges.FlightsSearcher;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsSearcher {

    public static void main(String[] args) {

        Database database = new Database();

        database.createDatabase();

        String depatureCity = "POZ";

        Set<Flight> searchDepaturesFromCity = database.getDatabase().stream()
                .filter(Flight -> Flight.getDepatureAirport().equals(depatureCity))
                .collect(Collectors.toSet());

        System.out.println("Flight depaturing from selected city: " + depatureCity);
        searchDepaturesFromCity.forEach(Flight -> System.out.println(Flight.getArrivalAirport()));

        String arrivalCity = "KRK";

        Set<Flight> searchArrivalsFromCity = database.getDatabase().stream()
                .filter(Flight -> Flight.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toSet());

        System.out.println("Flight arriving to selected city: " + arrivalCity);
        searchArrivalsFromCity.forEach(Flight -> System.out.println(Flight.getDepatureAirport()));

        Set<Flight> searchConnectingFlight = database.getDatabase().stream()
                .filter(Flight -> Flight.getDepatureAirport().equals(depatureCity))
                .??;

        System.out.println("Searching Connecting Flight from: " + depatureCity
        + " to: " + arrivalCity);
    }
}
