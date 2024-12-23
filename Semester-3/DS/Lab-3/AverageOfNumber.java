// 15. Write a program to calculate average of first n numbers.

import java.util.*;
public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Here:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        double avg = (double)sum/n;
        System.out.println("Average is:"+avg);
    }
}
