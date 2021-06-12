package com.max.idea;


import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        System.out.println("Введите количество столбцов:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите количество строк");
        int y = sc.nextInt();
        int[][] twoDimArray = new int[x][y];
        int n =3;
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.println("Введите элемент матрицы " + (i+1)+","+(j+1)+":");
                int element = sc.nextInt();
                twoDimArray[i][j] = element;
            }
        }
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.print(" " + twoDimArray[ i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            twoDimArray[i][0] = twoDimArray[i][0]*n;
            System.out.print(" " + twoDimArray[i][0] + " ");
        }

    }

}