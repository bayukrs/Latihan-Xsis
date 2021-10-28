package com.tutorial;

public class Main {

    public static void main(String[] args) {
        System.out.println("===========================Angka Ganjil");
        int angkaGanil = 0;

        for (int i = 0; i < 7; i++){
            angkaGanil = i * 2 + 1;
            System.out.print(angkaGanil + ", ");
        }

        System.out.println("\n===========================Faktorial 2");
        int faktorialDua = 2;
        int n;

        for (int i = 0; i < 7; i++){
            System.out.print(faktorialDua + ", ");
            n = faktorialDua * 2;
            faktorialDua = n;
        }

        System.out.println("\n===========================Fibonacci");
        int fn = 1;
        int fn1 = 0;
        int fn2 = 0;

        for (int i = 0; i < 7; i++){
            System.out.print(fn + ", ");
            fn1 = fn2;
            fn2 = fn;
            fn = fn1 + fn2;
        }
    }
}
