package com.company;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        int rekurencja;
        rekurencja = r.sumaRekurencja(5);
        System.out.println(rekurencja);

//        int result = sumaIteracja(5);
//        System.out.println(result);
    }
//    public static int sumaIteracja(int n) {
//        int suma = 0;
//        while (n > 0) {
//            suma = suma + n;
//            n--;
//        }
//        return suma;
//    }

    public int sumaRekurencja(int n){
        if(n>0){
            return n + sumaRekurencja(n-1);
        }else
            return 0;
    }
}
