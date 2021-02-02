package challenges.FlightsSearcher;

import java.util.HashSet;
import java.util.Set;

public class Database {

    Set<Flight> database = new HashSet<>();

    public void createDatabase() {
        database.add(new Flight("POZ", "WAR"));
        database.add(new Flight("WRO", "WAR"));
        database.add(new Flight("GDA", "WAR"));
        database.add(new Flight("POZ", "WRO"));
        database.add(new Flight("POZ", "GDA"));
        database.add(new Flight("WRO", "GDA"));
        database.add(new Flight("KRK", "WAR"));
        database.add(new Flight("WAR", "KRK"));
        database.add(new Flight("WRO", "KRK"));
        database.add(new Flight("GDA", "KRK"));
    }

    public Set<Flight> getDatabase() {
        return database;
    }
}
