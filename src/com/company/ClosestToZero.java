package com.company;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] table = {20, 7, 32, -10, -5, 15, -30};

        int minimumSum = table[0] + table[1];
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                int sum = table[i] + table[j];
                if (Math.abs(sum) < Math.abs(minimumSum)) {
                    firstNumber = table[i];
                    secondNumber = table[j];
                    minimumSum = sum;
                }
            }
        }
        System.out.println(minimumSum);

        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
