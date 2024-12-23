// 6. Write a program to check whether a year is leap year or not.[B]

import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        if(year%4==0 && year%400!=0 || year%100==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        } 
    }
}
