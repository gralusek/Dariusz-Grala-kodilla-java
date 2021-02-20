package com.kodilla.patterns.builders.bigmac;

import com.kodilla.patterns.builders.BigMac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                .bun("With seasam")
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Onion")
                .ingredient("cheese")
                .ingredient("Chilli")
                .ingredient("salad")
                .build();
        System.out.println(bigMac);
        //When
        int ingredientsCounter = bigMac.getIngredients().size();
        //Then
        Assertions.assertEquals(4, ingredientsCounter);
    }
}
