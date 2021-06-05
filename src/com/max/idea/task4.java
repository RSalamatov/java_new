package com.max.idea;


import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите число X: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите число Y: ");
        int y = sc.nextInt();
        System.out.println("Введите число Z: ");
        int z = sc.nextInt();


        double sum = x+y+z;
        double srar = sum/3;
        System.out.println(srar);
        System.out.println("Среднее арифметическое= " + srar);
        srar = srar/2;
        System.out.println("Округление в меньшую сторону= " + Math.floor(srar));
        if(srar > 3) {
            System.out.println("Программа выполнена корректно");

} else {
            System.out.println("Выполните программу еще раз");
        }
    }
}