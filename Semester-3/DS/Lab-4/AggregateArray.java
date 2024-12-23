// 28. Suppose you are senior developer for an Relational Database Management System named "Array Database" where everything is 
// implemented using only array, today your task is to implement aggregate function like sum, min, max, avg. For simplicity, 
// assume that your database can only store integers.

import java.util.*;
public class AggregateArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n = sc.nextInt();
        int[] a = new int [n];
        int min =0,max=0,sum=0,avg=0;
        System.out.println("Enter Elements:");
        for(int i=0 ; i<n ;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ;i++)
        {
            sum += a[i];
            if( a[min] > a[i] )
                min = i;

            else if( a[max] < a[i] )
                max = i;
        }
        System.out.println("Min = "+a[min]);
        System.out.println("Max = "+a[max]);
        System.out.println("Sum = "+sum);
        System.out.println("Avg = "+(sum/n));
    }
}
