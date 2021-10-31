package com.company;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

    }
}
