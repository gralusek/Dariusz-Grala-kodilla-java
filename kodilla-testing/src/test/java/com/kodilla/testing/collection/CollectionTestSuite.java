package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;
import java.util.*;


public class CollectionTestSuite {


    @BeforeAll
    public static void beforeAll() {System.out.println("Test Suite: begin");}

    @AfterAll
    public static void afterAll() {System.out.println("Test Suite: end");}

    @BeforeEach
    public void before() { System.out.println("Test case: begin"); }
    OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

    @AfterEach
    public void after() {System.out.println("Test case: end"); }

    @DisplayName(
            " When created numberList with null then " +
                    "Then nullPointerException should return?"
    )

    @Test

    public void testOddNumbersExterminatorEmptyList() {

        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumberExterminator.exterminate(emptyList);
        Integer result = resultList.size();
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(0, result);
    }

    @DisplayName(
            "When adding numbers to numberList, odd numbers should be exterminated " +
                    "then even numbers be returned in expectedList"
    )

    @Test

    public void testOddNumberExterminatorNormalList() {

        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(4);
        normalList.add(3);
        normalList.add(7);
        normalList.add(8);

        List<Integer> resultListNormal = new ArrayList<>();
        resultListNormal.add(4);
        resultListNormal.add(8);

        //When
        List<Integer> expectedResultList = oddNumberExterminator.exterminate(normalList);
        System.out.println("Testing Normal List");

        //Then
        Assertions.assertEquals(expectedResultList, resultListNormal );
    }
}
