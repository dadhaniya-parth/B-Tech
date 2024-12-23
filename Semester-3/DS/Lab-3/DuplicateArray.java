// 17. Write a program to find whether the array contains a duplicate number or not.

import java.util.*;
public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count!=0){
            System.out.println("Duplicate Value Found");
        }
        else{
            System.out.println("Duplicate Value Not Found");
        }
    }
}
