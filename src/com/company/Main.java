package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {7.2, 2.1, -5.9, 9.3, 8.5, 1.4, -7.2, 1.9, -6.3, 5.5, 3.2, 4.4, -8.2, 4.5, 1.6};
        double sum = 0;
        int numbers2 = 0;
        int positiveIndexes = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers2 = i;
                break;
            }
        }

        for (int i = numbers2; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveIndexes++;
                sum += numbers[i];
            }
        }
        System.out.println("Сумма всех положительных чисел после первого отрицательного = " + sum);
        System.out.println(" Среднее всех положительных чисел после первого отрицательного = " + (double)sum / positiveIndexes);

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]){
                    double tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "    ");
        }
    }
}

