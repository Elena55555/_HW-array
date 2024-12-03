package org.example;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Work № 5 ");

        System.out.println("Task № 1");
        int[] array1 = {3, 87, 12, 98, 2, 4, 66};
        task1(array1);

        System.out.println("Task № 2");
        double[] array = {3.0, 100.8, 8.7};
        System.out.println(Arrays.toString(task2_sortArray(array)));

        System.out.println(" ");
        System.out.println("Task № 3");
        int[] ar = {6, 117, 44, 5, 32, 81, 9};
        task3(ar);
    }

    public static void task1(int[] array1) {
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }
    }

    public static double[] task2_sortArray(double[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] < array[k + 1]) {
                    double temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void task3(int[] ar) {
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] % 2 == 0) {
                System.out.println(ar[j]);
            }
        }
    }
}

















