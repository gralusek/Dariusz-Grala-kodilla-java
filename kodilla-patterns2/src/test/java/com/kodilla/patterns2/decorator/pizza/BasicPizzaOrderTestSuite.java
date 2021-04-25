package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BasicPizzaOrderTestSuite {

    @Test
    void testGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    void testGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, mozarella", description);
    }

    @Test
    void testGetCostPizzaWithDoubleSalami() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    void testGetDescriptionPizzaWithDoubleSalami() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, mozarella, salami, salami", description);
    }

    @Test
    void testGetCostPizzaWithExTraCheeseHabanero() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtreCheeseDecorator(theOrder);
        theOrder = new HabaneroDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), calculatedCost);
    }

    void testGetDescriptionPizzaWithExTraCheeseHabanero() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtreCheeseDecorator(theOrder);
        theOrder = new HabaneroDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, mozarella, extra cheese, habanero", description);
    }
}