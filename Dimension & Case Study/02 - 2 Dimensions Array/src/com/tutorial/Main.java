package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // soal 1
        System.out.println("Soal 1");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal1 = userInput.nextInt();
        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal1 = userInput.nextInt();

        int[][] arraySoal1 = new int[2][nSoal1];
        int angka1 = 1;

        for (int i = 0; i < arraySoal1.length; i++) {
            for (int j = 0; j < nSoal1; j++) {
                if (i == 0){
                    arraySoal1[i][j] = j;
                }else{
                    arraySoal1[i][j] = angka1;
                    angka1 *= n2Soal1;
                }
            }
        }
        printArray2D(arraySoal1);

        // Soal 2
        System.out.println("Soal 2");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal2 = userInput.nextInt();
        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal2 = userInput.nextInt();

        int[][] arraySoal2 = new int[2][nSoal2];
        int angka2 = 1;

        for (int i = 0; i < arraySoal2.length; i++) {
            for (int j = 0; j < nSoal2; j++) {
                if (i == 0){
                    arraySoal2[i][j] = j;
                }else{
                    if ((j + 1) % 3 == 0){
                        angka2 *= -1;
                        arraySoal2[i][j] = angka2;
                        angka2 *= -n2Soal2;
                    }else{
                        arraySoal2[i][j] = angka2;
                        angka2 *= n2Soal2;
                    }
                }
            }
        }
        printArray2D(arraySoal2);

        // Soal 3
        System.out.println("Soal 3");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal3 = userInput.nextInt();
        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal3 = userInput.nextInt();

        int[][] arraySoal3 = new int[2][nSoal3];

        for (int i = 0; i < arraySoal3.length; i++) {
            for (int j = 0; j < nSoal3; j++) {
                if (i == 0){
                    arraySoal3[i][j] = j;
                }else{
                    if (nSoal3 % 2 == 1){
                        if (j >= nSoal3 / 2){
                            arraySoal3[i][j] = n2Soal3;
                            n2Soal3 /= 2;
                        }else{
                            arraySoal3[i][j] = n2Soal3;
                            n2Soal3 *= 2;
                        }
                    }else{
                        if (j >= nSoal3 / 2){
                            n2Soal3 /= 2;
                            arraySoal3[i][j] = n2Soal3;
                        }else{
                            arraySoal3[i][j] = n2Soal3;
                            n2Soal3 *= 2;
                        }
                    }
                }
            }
        }
        printArray2D(arraySoal3);

        // Soal 4
        System.out.println("Soal 4");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal4 = userInput.nextInt();
        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal4 = userInput.nextInt();

        int[][] arraySoal4 = new int[2][nSoal3];
        int angka4 = 1;
        int angka4_2 = n2Soal4;

        for (int i = 0; i < arraySoal4.length; i++) {
            for (int j = 0; j < nSoal4; j++) {
                if (i == 0){
                    arraySoal4[i][j] = j;
                }else{
                    if (j % 2 != 0){
                        arraySoal4[i][j] = angka4_2;
                        angka4_2 += n2Soal4;
                    }else{
                        arraySoal4[i][j] = angka4;
                        angka4++;
                    }
                }
            }
        }
        printArray2D(arraySoal4);

        // Soal 5
        System.out.println("Soal 5");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal5 = userInput.nextInt();

        int[][] arraySoal5 = new int[3][nSoal5];
        int angka5 = 0;

        for (int i = 0; i < arraySoal5.length; i++) {
            for (int j = 0; j < nSoal5; j++) {
                arraySoal5[i][j] = angka5;
                angka5++;
            }
        }
        printArray2D(arraySoal5);

        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal5 = userInput.nextInt();

        int[][] arraySoal5_2 = new int[3][n2Soal5];
        int angka5_2 = 0;

        for (int i = 0; i < arraySoal5_2.length; i++) {
            for (int j = 0; j < n2Soal5; j++) {
                arraySoal5_2[i][j] = angka5_2;
                angka5_2++;
            }
        }
        printArray2D(arraySoal5_2);

        // Soal 6
        System.out.println("Soal 6");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal6 = userInput.nextInt();

        int[][] arraySoal6 = new int[3][nSoal6];
        int angka6 = 1;

        for (int i = 0; i < arraySoal6.length; i++) {
            for (int j = 0; j < nSoal6; j++) {
                if (i == 0){
                    arraySoal6[i][j] = j;
                }else if (i == 1){
                    arraySoal6[i][j] = angka6;
                    angka6 *= nSoal6;
                }else{
                    arraySoal6[i][j] = arraySoal6[i-1][j] + arraySoal6[i-2][j];
                }
            }
        }
        printArray2D(arraySoal6);

        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal6 = userInput.nextInt();

        int[][] arraySoal6_2 = new int[3][n2Soal6];
        int angka6_2 = 1;

        for (int i = 0; i < arraySoal6_2.length; i++) {
            for (int j = 0; j < n2Soal6; j++) {
                if (i == 0){
                    arraySoal6_2[i][j] = j;
                }else if (i == 1){
                    arraySoal6_2[i][j] = angka6_2;
                    angka6_2 *= n2Soal6;
                }else{
                    arraySoal6_2[i][j] = arraySoal6_2[i-1][j] + arraySoal6_2[i-2][j];
                }
            }
        }
        printArray2D(arraySoal6_2);

        // Soal 7
        System.out.println("Soal 7");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal7 = userInput.nextInt();

        int[][] arraySoal7 = new int[3][nSoal7];
        int angka7 = 0;

        for (int i = 0; i < arraySoal7.length; i++) {
            for (int j = 0; j < nSoal5; j++) {
                arraySoal7[i][j] = angka7;
                angka7++;
            }
        }
        printArray2D(arraySoal7);

        // Soal 8
        System.out.println("Soal 8");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal8 = userInput.nextInt();

        int[][] arraySoal8 = new int[3][nSoal6];
        int angka8 = 0;

        for (int i = 0; i < arraySoal8.length; i++) {
            for (int j = 0; j < nSoal8; j++) {
                if (i == 0){
                    arraySoal8[i][j] = j;
                }else if(i == 1){
                    arraySoal8[i][j] = angka8;
                    angka8 += 2;
                }else{
                    arraySoal8[i][j] = arraySoal8[i-1][j] + arraySoal8[i-2][j];
                }
            }
        }
        printArray2D(arraySoal8);

        // Soal 9
        System.out.println("Soal 9");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal9 = userInput.nextInt();
        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal9 = userInput.nextInt();

        int[][] arraySoal9 = new int[3][nSoal9];
        int angka9 = 0;

        for (int i = 0; i < arraySoal9.length; i++) {
            for (int j = 0; j < nSoal9; j++) {
                if (i == 0){
                    arraySoal9[i][j] = j;
                }else if(i==1){
                    arraySoal9[i][j] = angka9;
                    angka9 += n2Soal9;
                }else{
                    arraySoal9[i][j] = arraySoal9[1][nSoal9 - (j + 1)];
                }
            }
        }
        printArray2D(arraySoal9);

        // Soal 10
        System.out.println("Soal 10");

        System.out.print("Masukkan nilai n ke 1 = ");
        int nSoal10 = userInput.nextInt();
        System.out.print("Masukkan nilai n ke 2 = ");
        int n2Soal10 = userInput.nextInt();

        int[][] arraySoal10 = new int[3][nSoal10];
        int angka10 = 0;

        for (int i = 0; i < arraySoal10.length; i++) {
            for (int j = 0; j < nSoal10; j++) {
                if (i==0){
                    arraySoal10[i][j] = j;
                }else if (i == 1){
                    arraySoal10[i][j] = angka10;
                    angka10 += n2Soal10;
                }else{
                    arraySoal10[i][j] = arraySoal10[i-1][j] + arraySoal10[i-2][j];
                }
            }
        }
        printArray2D(arraySoal10);
    }

    private static void printArray2D(int[][] dataArray){
        for (int i=0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
