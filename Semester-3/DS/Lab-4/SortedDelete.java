// 24. Write a program to delete a number from an array that is already sorted in an ascending order.

import java.util.*;
public class SortedDelete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        System.out.println("Enter the element you want to Delete:");
        int x = s.nextInt();


        for(int i=0; i<n; i++)
        {  
            if(a[i]==x)
             {
                for(int j=i; j<n-1; j++)
                {System.out.println(j);    
                    a[j] = a[j+1];
                }
                
                break;    
            }
            
        }
        
        System.out.println("After deleting:");
        for(int i = 0; i <n-1; i++)
        {
            System.out.println(a[i]);
        }
    
    }
}

