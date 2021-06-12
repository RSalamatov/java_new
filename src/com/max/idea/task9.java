package com.max.idea;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        System.out.println("Введите размер массива:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[] array = new double[number];
        int counter = number;
        int nums = 0;
        double sum = 0;
        while (counter > 0) {
            System.out.println("Введите элемент массива:");
            double element = sc.nextDouble();
            array[nums] = element;
            sum = sum + element;
            nums++;
            counter--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    double srarif = sum/number;

        System.out.println("\n" + srarif);
       for (int i = 0; i < array.length; i++) {
           array[i]= array[i]*srarif;
           System.out.print(array[i]+ " ");
       }

    }


    }