package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTestSuite {

    @Test
    public void exceptionTestGeneral() {
        //given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When
        //assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(2.0, 1.0));
        //assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException());
        String result = exceptionHandling.probablyIWillThrowException(2.0, 1.0);
        //Then
        assertEquals(result, "Not done");
    }

    @Test
    public void exceptionWithXEquals1() {
        //given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When
        //assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(0.8, 1.0));
        String result = exceptionHandling.probablyIWillThrowException(0.8, 1.0);
        //Then
        assertEquals(result, "Not done");
    }

    @Test
    public void exceptionWithXEquals5() throws Exception {
        //given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When
        //assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.5, 1.0));
        String result = exceptionHandling.probablyIWillThrowException(1.5, 1.0);
        //Then
        assertEquals(result, "Done!");
    }
}
