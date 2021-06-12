package com.max.idea;


import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("Введите размер массива:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new  int [number];
        int counter = number;
        int nums = 0;
        while (counter > 0){
            System.out.println("Введите элемент массива:");
            int element = sc.nextInt();

            array[nums] = element;
            if (element == x) {
                System.out.println("Данное значение имеется в константах");
            } else if (element==y) {
                System.out.println("Данное значение имеется в константах");
            } else if (element ==z) {
                System.out.println("Данное значение имеется в константах");
            }
            nums++;
            counter--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); }


    }
}