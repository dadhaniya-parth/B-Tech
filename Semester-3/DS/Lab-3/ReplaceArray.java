// 18. Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class ReplaceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter First Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2 = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==n1){
                arr[i] = n2;
            }
        }

        System.out.println("Updated Array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
