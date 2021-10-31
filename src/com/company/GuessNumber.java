package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(100) + 1;

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Podaj liczbę od 1 do 100");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess) {
                System.out.println("Liczba jest za mała.");
            } else if (userNumber > numberToGuess) {
                System.out.println("Liczba jest za duża");
            } else {
                System.out.println("Brawo! Zgadłeś :)");
                wasNumberGuessed = true;
            }

        }
    }
}
