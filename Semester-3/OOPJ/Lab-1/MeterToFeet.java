// 5. Write a program that reads a number in meters, converts it to feet, and displays the result.[A]

import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in meters: ");
        double m = sc.nextDouble();
        double f = m * 3.28084;
        System.out.println(m + " meters is equal to " + f + " feet");
    }
}
