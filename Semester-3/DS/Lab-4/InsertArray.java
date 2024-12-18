// 21. Write a program to insert a number at a given location in an array.

import java.util.Scanner;

public class InsertArray {
   public static void main(String[] args) {
        int n,loc,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size  Of Array:");
        n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Location:");
        loc = sc.nextInt();
        System.out.println("Enter Number:");
        num = sc.nextInt();
        for(int i=n;i>loc;i--){
            a[i] = a[i-1];
        }
        a[loc] = num;
        n++;
        System.out.println("New Array is:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
   }
}
