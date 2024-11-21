package it.step;

import java.util.Arrays;

import static it.step.Methods.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 4, 9};
        int target = 4;
        int result = linearSearch(array, target);
        System.out.println("Индекс элемента: " + result);

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 5;
        int result2 = binarySearch(array2, target2);
        System.out.println("Индекс элемента: " + result2);

        int[] array3 = {5, 3, 8, 4, 2};
        int[] bubbleSort = bubbleSort(array3);
        for (int num : bubbleSort) {
            System.out.print(num + " ");
        }

        String str = "radar";
        boolean result4 = isPalindrome(str);
        System.out.println();
        System.out.println(result4);

        int n = 5;
        int result5 = factorial(n);
        System.out.println("Факториал " + n + " равен " + result5);

        int n2 = 7;
        int result6 = fibonacciRecursive(n2);
        System.out.println("Рекурсивный метод: " + result6);

        int n3 = 7;
        int result7 = fibonacciIterative(n3);
        System.out.println("Итеративный метод: " + result7);

        int[] array4 = {2, 3, 3, 5, 5, 7};
        int[] result8 = removeDuplicates(array4);
        System.out.println("Массив без дубликатов: " + Arrays.toString(result8));
    }
}