// 3. Write a program to print given array in reverse order.

import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of Array:");
      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i=0;i<n;i++){
        System.out.println("Enter Element at Index "+(i+1)+" :");
        arr[i]=sc.nextInt();
      }
    System.out.println("\nReverse Array: ");
    for(int i=n-1;i>=0;i--){
        System.out.println(arr[i]+" ");
}
}
}
