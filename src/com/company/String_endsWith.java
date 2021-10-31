package com.company;

import java.util.Scanner;

public class String_endsWith {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();

        if (!name.isEmpty() && (!name.endsWith("a")|| name.equals("Barnaba"))|| name.equals("Kuba")) {
            System.out.println("Jesteś kobietą");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Jesteś mężczyzną");
        } else {
            System.out.println("Pole imię nie może być puste!");
        }
    }
}
