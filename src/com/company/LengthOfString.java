package com.company;

public class LengthOfString {
    public static void main(String[] args) {
        String word = "Ziemniak";

        char[] wordTable = word.toCharArray();

        int sum = 0;

        for (int i = 0; i < wordTable.length; i++) {
            sum = sum + 1;
        }
        System.out.println(sum);
    }
}
