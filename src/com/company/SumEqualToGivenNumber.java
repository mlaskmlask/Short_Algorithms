package com.company;

public class SumEqualToGivenNumber {
    public static void main(String[] args) {
        int[] array = {-40, -5, 1, 3, 6, 7, 8, 20};

    }

    public static boolean isEqual(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int currentSum = array[i]+ array[j];

                if(currentSum== number){
                    return true;
                }
            }
        }
        return false;
    }
}
