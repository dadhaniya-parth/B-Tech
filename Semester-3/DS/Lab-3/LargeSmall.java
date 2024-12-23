// 16. Write a program to find position of the smallest number & the largest number from given n numbers.

import java.util.*;
public class LargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int small = arr[0];
        int large = arr[0];

        for(int i=1;i<n;i++){
            if (arr[i]>large) {
                large = arr[i];
            }
            else  if (arr[i]<small) {
                small = arr[i];
            }
        }
        System.out.println("Large Number is:"+large);
        System.out.println("Small Number is:"+small);
    }
}
