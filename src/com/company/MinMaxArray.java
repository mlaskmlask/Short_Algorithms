package com.company;

public class MinMaxArray {

    public static void main(String[] args) {
        int[] array = {4, 76, 43, 29, 35, 87, 45, 26, 62, 2};

        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Największa liczba to: " + maxValue);
        System.out.println("Najmniejsza liczba to: " + minValue);
    }
}
