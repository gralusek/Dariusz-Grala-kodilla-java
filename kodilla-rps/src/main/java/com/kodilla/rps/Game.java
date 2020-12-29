package com.kodilla.rps;

import java.util.Random;

public class Game {

    String userName;
    Random generator = new Random();
    int userScore;
    int compScore;

    public Game(String userName) {
        this.userName = userName;
    }

    public String madeMove(int userMove) {

        int computerMove = generator.nextInt(3) + 1;

        if (userMove == 1) {
            if (computerMove == 1) {
                return "remis";
            }
            if (computerMove == 2) {
                compScore++;
                return "Wygrał komputer";
            }
            if (computerMove == 3) {
                userScore++;
                return ("Wygrał użytnownik " + userName);
            }
        }
        if(userMove == 2) {
            if (computerMove ==2) {
                return "remis";
            }
            if (computerMove == 3) {
                compScore++;
                return "Wygrał komputer";
            }
            if (computerMove == 1) {
                userScore++;
                return ("Wygrał użytnownik " + userName);
            }
        }

        if(userMove == 3) {
            if (computerMove ==3) {
                return "remis";
            }
            if (computerMove == 1) {
                compScore++;
                return "Wygrał komputer";
            }
            if (computerMove == 2) {
                userScore++;
                return ("Wygrał użytnownik " + userName);
            }
        }
        return null;

    }
}
