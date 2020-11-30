package com.kodilla.testing.collection;

import java.util.*;


public class OddNumberExterminator {
    public List<Integer> exterminate (List<Integer> numbers) {
        List<Integer> numberList = new ArrayList<>();

        for(int number : numbers) {
            if(number%2 == 0) {
                numberList.add(number);
            }
        }

        return numberList;
    }
}
