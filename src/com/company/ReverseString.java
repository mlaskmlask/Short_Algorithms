package com.company;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "";
        String toReverse = "Maja";

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reverse = reverse + toReverse.charAt(i);
        }
        System.out.println(reverse);
    }
}
