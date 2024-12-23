// 3. Write a program to calculate the area of Rectangle.[A]

import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Length:");
        double l = sc.nextDouble();
        System.out.println("Enter Breath:");
        double b = sc.nextInt();
        double area = l*b;
        System.out.println("Area Of Rectangle is:"+area);
    }
}
