package challenges.FlightsSearcher;

public class ConnectingFlight {

    private String from;
    private String trough;
    private String to;

    public ConnectingFlight(String from, String trough, String to) {
        this.from = from;
        this.trough = trough;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTrough() {
        return trough;
    }

    public String getTo() {
        return to;
    }
}

