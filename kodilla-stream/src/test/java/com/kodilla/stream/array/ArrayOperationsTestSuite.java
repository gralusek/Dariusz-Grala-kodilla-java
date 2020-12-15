package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] table = new int[4];
        table[0] = 5;
        table[1] = 3;
        table[2] = 7;
        table[3] = 3;
        //When
        double result = ArrayOperations.getAverage(table);
        //Then
        Assertions.assertEquals(4.5, result);

    }
}
