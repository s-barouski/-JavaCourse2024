package it.step;

import org.junit.jupiter.api.Test;

import static it.step.Methods.*;
import static it.step.Methods.bubbleSort;
import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void factorial() {
        int result = Methods.factorial(3);
        assertEquals(6, result);
    }

    @Test
    void binarySearch() {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 5;
        int result2 = Methods.binarySearch(array2, target2);
        assertEquals(4, result2);

    }

    @Test
    void linearSearh() {
        int[] array = {3, 5, 2, 4, 9};
        int target = 4;
        int result = Methods.linearSearch(array, target);
        assertEquals(3, result);
        int target2 = 1;
        int result2 = Methods.linearSearch(array, target2);
        assertEquals(-1, result2);

    }

    @Test
    void bubbleSort() {
        int[] array3 = {5, 1, 4, 2, 8};
        int[] sortedArray = {1, 2, 4, 5, 8};
        int[] result = Methods.bubbleSort(array3);
        assertArrayEquals(sortedArray, result);
    }

    @Test
    void isPalindrome() {
        String str = "madam";
        boolean result = Methods.isPalindrome(str);
        assertTrue(result);
        String str2 = "madama";
        boolean result2 = Methods.isPalindrome(str2);
        assertFalse(result2);
    }

    @Test
    void fibonacciRecursive() {
        int n2 = 7;
        int result = Methods.fibonacciRecursive(n2);
        assertEquals(13, result);
    }

    @Test
    void fibonacciIterative() {
        int number = 7;
        int result = Methods.fibonacciIterative(number);
        assertEquals(13, result);
        int number2 = 1;
        int result2 = Methods.fibonacciIterative(number2);
        assertEquals(1, result2);
        int number3 = 0;
        int result3 = Methods.fibonacciIterative(number3);
        assertEquals(0, result3);
    }

    @Test
    void removeDuplicates() {
        int[] array4 = {2, 3, 3, 5, 5, 7};
        int[] arrayNotDuplicates = {2, 3, 5, 7};
        int[] result = Methods.removeDuplicates(array4);
        assertArrayEquals(arrayNotDuplicates, result);
        int[] array5 = new int[0];
        int n = array5.length;
        if(n==0){
        int[] result2 = Methods.removeDuplicates(array5);
        assertArrayEquals(array5, result2);
    }
        int[] array6 = new int[1];
        int n2 = array6.length;
        if(n2==1){
            int[] result3 = Methods.removeDuplicates(array6);
            assertArrayEquals(array6, result3);
        }

}

}