// 1. The marks obtained by a student in 5 different subjects are input through the keyboard. 
// The student gets a division as per the following rules: 
// I. Percentage above or equals to 60-first division 
// II. Percentage between 50 to 59-second division 
// III. Percentage between 40 and 49-Third division 
// IV. Percentage less than 40-fail 
// Write a program to calculate the division obtained by the student.[A]

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks:");
        double tm = 0;
        for(int i=1;i<=5;i++){
            double m = sc.nextDouble();
            tm = tm + m;
        }
        double per = tm/5;
        System.out.println("Percentage is:"+per);
        if (per>=60) {
            System.out.println("First Division");
        }
        else if (per>=50 && per<=59) {
            System.out.println("Second Division");
        } 
        else if (per>=40 && per<=49){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }    
}