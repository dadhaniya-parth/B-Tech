// 4. Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 );[B]

import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        double f = sc.nextDouble();
        double c = (f-32)*(5.0/9);
        double f2 = (c*(9.0/5))+32;
        System.out.println("Celsius is:"+c);
        System.out.println("Fahrenhit is:"+f2);
    }
}