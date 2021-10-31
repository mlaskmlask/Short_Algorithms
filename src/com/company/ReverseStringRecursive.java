package com.company;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        ReverseStringRecursive rsr = new ReverseStringRecursive();
        String toReverse = "Pomidorek";
        String reverse = rsr.recursiveReverse("Pomidorek");
        System.out.println(reverse);
    }

    public String recursiveReverse(String original){
        if(original.length()==1){
            return original;
        }else {
            return original.charAt(original.length() - 1) +
                    recursiveReverse(original.substring(0, original.length() - 1));
        }

    }
}
