package challenges.FlightsSearcher;

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

    @Override
    public String toString() {
        return "Flight{" +
                "depatureAirport='" + depatureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!depatureAirport.equals(flight.depatureAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = depatureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }
}

