// 14. Write a program to calculate sum of numbers from m to n.

import java.util.*;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting Value:");
        int m = sc.nextInt();
        System.out.println("Enter Ending Value:");
        int n = sc.nextInt();
        int sum =0;
        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum is:"+sum);
    }
}
