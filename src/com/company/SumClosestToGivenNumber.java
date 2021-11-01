package com.company;

public class SumClosestToGivenNumber {
    public static void main(String[] args) {
        int[] array = {-40, -5, 1, 3, 6, 7, 8, 20};

        System.out.println(findDifferenceClosestToGivenNumber(array, 2));
    }

    public static int findDifferenceClosestToGivenNumber(int[] array, int number) {
        int minimumDifference = (array[0] + array[1]) - number;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = (array[i] + array[j])-number;

                if (Math.abs(minimumDifference)>Math.abs(sum)){
                    minimumDifference = sum;
                }
            }
        }
        return minimumDifference;

    }
}
