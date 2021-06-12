package com.max.idea;
import java.util.Scanner;



public class task8 {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        if (number < 0){
            System.out.println("Это не положительное число");
        } else
            System.out.println(sum);
    }
}
