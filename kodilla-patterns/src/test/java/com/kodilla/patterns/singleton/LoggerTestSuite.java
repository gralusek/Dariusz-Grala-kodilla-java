package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger.INSTANCE.log("exmaple log");
        //When
        String loged = logger.INSTANCE.getLastLog();

        //Then
        assertEquals("exmaple log", loged);
    }
}
