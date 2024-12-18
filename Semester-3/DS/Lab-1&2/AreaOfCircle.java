// 1. w.a.p. to calculate area of a circle.

import java.util.*;
public class AreaOfCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("Area of circle :"+area);
    }
}