package com.max.idea;


import java.util.Scanner;

public class task5 {


    public static void main(String[] args){


            System.out.println("Введите число:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            System.out.println("Введите число:");
            int number2 = sc.nextInt();

            System.out.println("Введите операцию:");

            char sim = sc.next().charAt(0);

            if (sim == '-') {

                System.out.println("Результат операции: " + (number - number2));

            } else if (sim == '+') {
                    System.out.println("Результат операции: " + (number+number2));

            } else if (sim == '*') {
                        System.out.println("Результат операции: " + number*number2);

            } else if (sim == '/') {
                            System.out.println("Результат операции: " + number/number2);



                        }
                    }
                }

