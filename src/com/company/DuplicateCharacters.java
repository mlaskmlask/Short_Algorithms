package com.company;


import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "Biedronkaa";
        HashMap<Character, Integer> wordMap = new HashMap();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (wordMap.containsKey(c)) {
                wordMap.put(c, wordMap.get(c) + 1);
            } else {
                wordMap.put(c, 1);
            }
        }
        for (Character c : wordMap.keySet())
            if (wordMap.get(c) > 1) {
                System.out.println("Litera " + c + " powtarza się " + wordMap.get(c) + " razy.");
            }
    }
}
