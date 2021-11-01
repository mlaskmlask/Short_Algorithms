package com.company;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] table = {20, 7, 32, -10, -5, 15, -30};

        int minimumSum = table[0] + table[1];
        int pairFirstIndex = 0;
        int pairSecondIndex = 1;

        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                int sum = table[i] + table[j];
                if (Math.abs(sum) < Math.abs(minimumSum)) {
                    minimumSum = sum;
                }
            }
        }
        System.out.println(minimumSum);
    }
}
