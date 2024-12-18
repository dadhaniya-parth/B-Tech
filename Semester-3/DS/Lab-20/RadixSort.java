// 95. Write a program to implement Radix Sort using Array.

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    static int getMax(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static void countingSort(int[] array, int n, int exp) {
        int[] output = new int[n]; 
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            int index = (array[i] / exp) % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i] / exp) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    static void radixSort(int[] array, int n) {
        int max = getMax(array, n);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, n, exp);
        }
    }

    static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array:");
        printArray(array, n);

        radixSort(array, n);

        System.out.println("Sorted Array:");
        printArray(array, n);
    }
}
