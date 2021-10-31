package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        
        int n = userInput.nextInt();
        
        // soal 1
        System.out.println("Soal 1");

        int[] soal1 = new int[n];
        int angka1 = 1;

        for (int i = 0; i < n; i++) {
            soal1[i] = angka1;
            angka1 += 2;
        }
        System.out.println(Arrays.toString(soal1));

        // Soal 2
        System.out.println("Soal 2");

        int[] soal2 = new int[n];
        int angka2 = 2;

        for (int i = 0; i < n; i++) {
            soal2[i] = angka2;
            angka2 += 2;
        }
        System.out.println(Arrays.toString(soal2));
        
        // Soal 3
        System.out.println("Soal 3");

        int[] soal3 = new int[n];
        int angka3 = 1;

        for (int i = 0; i < n; i++) {
            soal3[i] = angka3;
            angka3 += 3;
        }
        System.out.println(Arrays.toString(soal3));

        // soal 4
        System.out.println("Soal 4");

        int[] soal4 = new int[n];
        int angka4 = 1;

        for (int i = 0; i < n; i++) {
            soal4[i] = angka4;
            angka4 += 4;
        }
        System.out.println(Arrays.toString(soal4));
        
        // soal 5
        System.out.println("Soal 5");
        
        String[] soal5 = new String[n];
        int angka5 = 1;

        for (int i = 0; i < n; i++) {
            if((i + 1) % 3 == 0){
                soal5[i] = "*";
            }else{
                soal5[i] = String.valueOf(angka5);
                angka5 += 4;
            }
        }
        System.out.println(Arrays.toString(soal5));

        // soal 6
        System.out.println("Soal 6");

        String[] soal6 = new String[n];
        int angka6 = 1;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0){
                soal6[i] = "*";
            }else {
                soal6[i] = String.valueOf(angka6);
            }
            angka6 += 4;
        }
        System.out.println(Arrays.toString(soal6));

        // Soal 7
        System.out.println("Soal 7");

        int[] soal7 = new int[n];
        int angka7 = 2;

        for (int i = 0; i < n; i++) {
            soal7[i] = angka7;
            angka7 *= 2;
        }
        System.out.println(Arrays.toString(soal7));

        // Soal 8
        System.out.println("Soal 8");

        int[] soal8 = new int[n];
        int angka8 = 3;

        for (int i = 0; i < n; i++) {
            soal8[i] = angka8;
            angka8 *= 3;
        }
        System.out.println(Arrays.toString(soal8));

        // soal 9
        System.out.println("Soal 9");

        String[] soal9 = new String[n];
        int angka9 = 4;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0){
                soal9[i] = "*";
            }else{
                soal9[i] = String.valueOf(angka9);
                angka9 *= 4;
            }
        }
        System.out.println(Arrays.toString(soal9));

        // soal 10

        System.out.println("Soal 10");

        String[] soal10 = new String[n];
        int angka10 = 3;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 4 == 0){
                soal10[i] = "XXX";
            }else{
                soal10[i] = String.valueOf(angka10);
            }
            angka10 *= 3;
        }
        System.out.println(Arrays.toString(soal10));
    }
}
