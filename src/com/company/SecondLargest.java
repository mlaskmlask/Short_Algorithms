package com.company;

public class SecondLargest {
    public static void main(String[] args) {

        int[] table = {34, 65, 32, 75, 23, 63, 73};

        int maxValue = table[0];
        int secondMaxValue = table[0];
        for (int i = 0; i < table.length; i++) {
            if (maxValue < table[i]) {
               maxValue = table[i];
            }
            else if(secondMaxValue<table[i] && secondMaxValue!=maxValue){
                secondMaxValue = table[i];
            }
        }
        System.out.println(secondMaxValue);

    }
}