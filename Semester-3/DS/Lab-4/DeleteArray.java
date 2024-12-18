// 22. Write a program to delete a number from a given location in an array.

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] a = new int [n];
        System.out.println("Enter Elements:");
        for(int i=0 ; i<=n-1 ;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Location:");
        int loc = sc.nextInt();
        for(int i=loc ; i < n-1 ; i++)
        {
            a[i] = a[i+1];
        }
        System.out.println("New Array is:");
        for(int i=0 ; i<n-1 ;i++)
        {
            System.out.println(a[i]);
        }
    }
}
