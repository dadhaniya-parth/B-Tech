// 2. Write a program to check whether a number is even or odd.[A]

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
