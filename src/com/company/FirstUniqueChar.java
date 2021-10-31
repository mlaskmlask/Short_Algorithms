package com.company;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("analog"));

    }

    public static Character firstNonRepeatedCharacter(String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (word.lastIndexOf(charArray[i]) == word.indexOf(charArray[i])){
                return charArray[i];
            }
        }
        return null;
    }
}
