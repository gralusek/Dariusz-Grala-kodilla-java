package com.kodilla.exception.test;

public class ExceptionHandling {

    public String probablyIWillThrowException(double x, double y) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            return secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            return "Not done";
        } finally {
            System.out.println("Final text");
        }
    }
}
