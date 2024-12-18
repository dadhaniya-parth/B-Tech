// =>  Write a program to implement a Binary Search using Array  in recursive approch in java.

import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                return binarySearch(arr, left, mid - 1, key);
            }

            return binarySearch(arr, mid + 1, right, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

        int result = binarySearch(arr, 0, n - 1, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
