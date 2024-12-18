//4. Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.[A]

import java.util.*;
public class SumOfNumber{
public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Two Numbers:");
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int sum = n1+n2;
    System.out.println("Sum is:"+sum);
}
}