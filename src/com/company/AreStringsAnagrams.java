package com.company;

import java.util.Arrays;

public class AreStringsAnagrams {
    public static void main(String[] args) {
        String word;
        String anagram;
        System.out.println(areSortedWordsEqual("angel", "angle"));
    }

    public static boolean areSortedWordsEqual(String word, String anagram) {
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);
        if (sortedWord.equals(sortedAnagram)) {
            return true;
        }
        return false;
    }

    public static String sortChars(String word) {
        char[] wordArray = word.toLowerCase().toCharArray();
        Arrays.sort(wordArray);
        return String.valueOf(wordArray);
    }
}
