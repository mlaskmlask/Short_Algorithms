package com.company;

import java.util.Arrays;

public class ZerosAndOnes {
    public static void main(String[] args) {
      int [] array = {0,1,0,0,1,1,1,0,1};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int i = 0; i<array.length; i++){
            if(array[i]==0){
                count++;
            }
        }

        for (int i = 0; i<count; i++){
            array[i] = 0;
        }
        for(int i= count; i<array.length; i++){
            array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
