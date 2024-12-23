// 33. Write a program to swap two numbers using user-defines method.

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=sc.nextInt();
        System.out.println("enter second number");
        int n2=sc.nextInt();
        swap(n1,n2);
    }
    static void  swap(int n1,int n2){
        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("first number is"+n1);
        System.out.println("second number is"+n2);
    }
}
