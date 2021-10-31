package com.company;

public class StringBufferReverse {
    public static void main(String[] args) {
        String toReverse = "Kubek";
        StringBuffer stringBuffer = new StringBuffer(toReverse);
        System.out.println(stringBuffer.reverse());
    }
}
