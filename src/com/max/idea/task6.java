package com.max.idea;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        int metrpar = 1;
        int milpar = 2;
        int yarpar = 3;
        int futpar = 4;
        double metrvmetr = 1;
        double metrvmili = 0.0006;
        double metrvyard = 1.094;
        double metrvfut = 3.281;
        double milivmetr = 1609.34;
        double milivmili = 1;
        double milivyard = 1760;
        double milivfut = 5280;
        double yardvmetr = 0.9144;
        double yardvmili = 0.0006;
        double yardvyard = 1;
        double yardvfut = 3;
        double futvmetr = 0.3048;
        double futvmili = 0.000189;
        double futvyard = 0.333;
        double futvfut = 1;
        double nummetr;
        double nummili;
        double numyard;
        double numfut;
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        int num = in.nextInt();

        if (num == 2) {
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
            int num2 = in.nextInt();
            if (num2 == metrpar) {
                System.out.print("Введите число: ");
                double num3 = in.nextDouble();
                nummetr = num3 * metrvmetr;
                nummili = num3 * metrvmili;
                numyard = num3 * metrvyard;
                numfut = num3 * metrvfut;
                System.out.println("Метры:" + nummetr);
                System.out.println("МИЛИ:" + nummili);
                System.out.println("ярды:" + numyard);
                System.out.println("футы:" + numfut);

            } else {
                if (num2 == milpar) {
                    System.out.print("Введите число: ");
                    double num3 = in.nextDouble();
                    nummetr = num3 * milivmetr;
                    nummili = num3 * milivmili;
                    numyard = num3 * milivyard;
                    numfut = num3 * milivfut;
                    System.out.println("Метры:" + nummetr);
                    System.out.println("МИЛИ:" + nummili);
                    System.out.println("ярды:" + numyard);
                    System.out.println("футы:" + numfut);

                } else {
                    if (num2 == yarpar) {
                        System.out.print("Введите число: ");
                        double num3 = in.nextDouble();
                        nummetr = num3 * yardvmetr;
                        nummili = num3 * yardvmili;
                        numyard = num3 * yardvyard;
                        numfut = num3 * yardvfut;
                        System.out.println("Метры:" + nummetr);
                        System.out.println("МИЛИ:" + nummili);
                        System.out.println("ярды:" + numyard);
                        System.out.println("футы:" + numfut);

                    } else {
                        if (num2 == futpar) {
                            System.out.print("Введите число: ");
                            double num3 = in.nextDouble();
                            nummetr = num3 * futvmetr;
                            nummili = num3 * futvmili;
                            numyard = num3 * futvyard;
                            numfut = num3 * futvfut;
                            System.out.println("Метры:" + nummetr);
                            System.out.println("МИЛИ:" + nummili);
                            System.out.println("ярды:" + numyard);
                            System.out.println("футы:" + numfut);

                        }

                    }
                }
            }
        } else if (num == 1) {
            System.out.println("Вы ввели массу (1), а надо расстояние (2)");
        }
    }
}