// 23. Write a program to insert a number in an array that is already sorted in an ascending order.

import java.util.*;
public class SortedInsert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        System.out.println("Enter the element you want to insert:");
        int x = s.nextInt();
        for(int i=0; i<n; i++)
        {
            if(x > a[i] && x < a[i+1])
            {
                for(int j=n; j>i+1; j--)
                {
                    a[j] = a[j-1];
                }
                a[i+1] = x;
            }
        }
        System.out.println("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(a[n]);    
    }
}
