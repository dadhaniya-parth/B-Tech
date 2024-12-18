// 2. Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.

import java.util.Scanner;

public class DisplayAverage {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a[] = new int[4];
     int ans = 0;
     int n = 4;
     System.out.println("Enter 4 elements here:");
     for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        ans += a[i];
     }
     double avg = (double) ans / n;
     System.out.println("Average is:"+avg);
}
}
