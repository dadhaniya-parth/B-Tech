// 26. Write a program to merge two unsorted arrays.

import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of First Array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter Elements Of First Array:");
        for(int i=0;i<n1;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Size Of Second Array:");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter Elements Of Second Array:");
        for(int i=0;i<n2;i++){
            b[i] = sc.nextInt();
        }
        
        int[] c = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < n2; i++) {
            c[n1 + i] = b[i];
        }

        // Print the merged array
        System.out.println("Merged Array: ");
        for (int i = 0; i < n1+n2; i++) {
            System.out.println(c[i]);
        }
    }
}
