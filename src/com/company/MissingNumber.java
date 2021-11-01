package com.company;

public class MissingNumber {
    public static void main(String[] args) {


        int[] array = {4, 2, 7, 3, 1, 5};

        int numberOfElements = array.length + 1;
        int sum = numberOfElements * (numberOfElements + 1) / 2;
        int partSum = 0;

        for (int i = 0; i < array.length; i++){
            partSum=partSum+array[i];
        }

        int missingNumber = sum-partSum;
        System.out.println("Brakująca liczba to "+ missingNumber);
    }
}