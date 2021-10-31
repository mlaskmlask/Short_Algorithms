package com.company;

import java.util.HashSet;

public class AllUniqueChars {
    public static void main(String[] args) {

        System.out.println(areAllCharsUnique("Mlask"));
    }

    public static boolean areAllCharsUnique (String word){

        HashSet wordSet = new HashSet();
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);

            if(!wordSet.add(c))
                return false;
        }
        return true;
    }
}
