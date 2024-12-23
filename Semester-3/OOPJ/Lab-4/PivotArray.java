// 7. There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot
// index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ...,
// nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7]
// might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the
// index of target if it is in nums, or -1 if it is not in nums.[C]

import java.util.*;
public class PivotArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter elements of Array:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Pivot:");
        int pivot = sc.nextInt();
        int[] b = new int[size];
        int count = 0;
        for(int i=pivot;i<size;i++){
            b[count]=a[i];
            count++;
        }
        for(int i=0;i<pivot;i++){
            b[count]=a[i];
            count++;
        }
        System.out.println("New Array:");
        for(int i=0;i<size;i++){
            System.out.println(b[i]);
        }
        System.out.println("Enter Target:");
        int target = sc.nextInt();
        int index = -1;
        for(int i=0;i<size;i++){
            if(b[i]==target){
                index = i;
                break;
                }
            }
            System.out.println("Index of Target is : "+index);
    }
}
