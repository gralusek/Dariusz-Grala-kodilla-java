package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    public void TestGetPeopleQuantity() {
        //Given
        World world = new World();

        Country country0 = new Country("Poland", new BigDecimal(40000000));
        Country country1 = new Country("Germany", new BigDecimal(80000000));
        Country country2 = new Country("Ukraine", new BigDecimal(60000000));
        Country country3 = new Country("Russia", new BigDecimal(800000000));
        Country country4 = new Country("China", new BigDecimal(1000000000));
        Country country5 = new Country("Thailand", new BigDecimal(4000000));
        Country country6 = new Country("US", new BigDecimal(900000000));
        Country country7 = new Country("Kanada", new BigDecimal(700000000));
        Country country8 = new Country("Mexico", new BigDecimal(850000000));

        Continent europe = new Continent("Europe");
        europe.addCountry(country0);
        europe.addCountry(country1);
        europe.addCountry(country2);
        Continent asia = new Continent("asia");
        asia.addCountry(country3);
        asia.addCountry(country4);
        asia.addCountry(country5);
        Continent northAmerica = new Continent("northAmerica");
        northAmerica.addCountry(country6);
        northAmerica.addCountry(country7);
        northAmerica.addCountry(country8);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal expected = new BigDecimal("4434000000");
        BigDecimal result = world.getPeopleQuantity();

        //Then
        assertEquals(expected, result);

    }
}
