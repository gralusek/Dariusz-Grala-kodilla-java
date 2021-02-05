package challenges.FlightsSearcher;

public class Application {

    public static void main(String[] args) {

        Database database = new Database();
        database.createDatabase();

        FlightsSearcher flightsSearcher = new FlightsSearcher();

        ConnectingFlight connectingFlight = new ConnectingFlight("POZ", "WAR", "KRK");
        Flight flight = new Flight("POZ", "KRK");

        //System.out.println(flightsSearcher.searchDepaturesFromCity(database, "POZ"));
        //flightsSearcher.searchArrivalsFromCity(database, "KRK");
        //flightsSearcher.searchConnectingFlight(database, connectingFlight);
        System.out.println(flightsSearcher.searchConnectingFlight2(database, flight));
    }
}
