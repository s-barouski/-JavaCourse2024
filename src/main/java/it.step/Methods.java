package it.step;

public class Methods {

    public static int linearSearch(int[] array, int target) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array2, int target2) {
        int start = 0;
        int end = array2.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array2[mid] == target2) {
                return mid;
            } else if (array2[mid] < target2) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int[] bubbleSort(int[] array3) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < array3.length; i++) {
                int previous = array3[i - 1];
                int current = array3[i];
                if (current < previous) {
                    array3[i] = previous;
                    array3[i - 1] = current;
                    sorted = false;
                }
            }
        }
        return array3;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }

    }

    public static int fibonacciRecursive(int n2) {
        if (n2 <= 1) {
            return n2;
        } else {
            return fibonacciRecursive(n2 - 1) + fibonacciRecursive(n2 - 2);
        }
    }

    public static int fibonacciIterative(int n3) {
        if (n3 <= 1) {
            return n3;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n3; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int[] removeDuplicates(int[] array4) {
        int n = array4.length;
        if (n == 0 || n == 1) {
            return array4;
        }
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array4[i] != array4[i + 1]) {
                temp[j++] = array4[i];
            }
        }
        temp[j++] = array4[n - 1];

        int[] result8 = new int[j];
        System.arraycopy(temp, 0, result8, 0, j);
        return result8;
    }
}




