// 5. Write a program to check that the given number is prime or not.[A]

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            } 
        }
        if (count==2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}
