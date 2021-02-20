package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Millenial John");
        User yGeneration = new YGeneration("Ygeneration Michael");
        User zGeneration = new ZGeneration("ZGeneration Adam");

        //When
        String johnSocial = millenials.share();
        System.out.println("John says: " + johnSocial);
        String michaelSocial = yGeneration.share();
        System.out.println("Michael says: " + michaelSocial);
        String adamSocial = zGeneration.share();
        System.out.println("Adam says: " + adamSocial);

        //Then
        assertEquals("I'm using Facebook!", johnSocial);
        assertEquals("I'm using Twitter!", michaelSocial);
        assertEquals("I'm using Snapchat!", adamSocial);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Millenial John");
        //When
        String johnSocial = millenials.share();
        System.out.println("John says: " + johnSocial);
        millenials.sharePost(new TwitterPublisher());
        johnSocial = millenials.share();
        System.out.println("John says now: " + johnSocial);
        //Then
        assertEquals("I'm using Twitter!", johnSocial);
    }
}
