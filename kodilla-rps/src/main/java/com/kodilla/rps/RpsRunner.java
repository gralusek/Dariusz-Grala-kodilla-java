package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        while(!end) {
            System.out.println("Witaj w grze papier, kamień, nożyce! Jak masz na imię?");
            String name = scanner.nextLine();
            System.out.println(name + ", do ilu wygranych rund chcesz grać?");
            int rundNumber = scanner.nextInt();
            System.out.println("Zasady gry: \n" +
                    "klawisz 1 – zagranie \"kamień\",\n" +
                    "klawisz 2 – zagranie \"papier\",\n" +
                    "klawisz 3 – zagranie \"nożyce\",\n" +
                    "klawisz x – zakończenie gry,\n" +
                    "klawisz n – uruchomienie gry od nowa");
            Game game = new Game(name);

            while(!(game.userScore == rundNumber || game.compScore == rundNumber)) {
                System.out.println(name + ", jaki jest twój natępny ruch? (1, 2 lub 3)");

                int userMove = scanner.nextInt();

                String result = game.madeMove(userMove);
                System.out.println(result);
                System.out.println("Aktualny wynik, Użytkovnik vs komputer: " + game.userScore + ":" + game.compScore);
            }

            System.out.println("Koniec gry!\nGramy dalej(n) czy kończymy(x)?");
            String empty = scanner.nextLine();
            String decision = scanner.nextLine();
            if (decision.equals("x")) {
                end = true;
            }
        }
        System.out.println("Koniec gry");
    }
}
