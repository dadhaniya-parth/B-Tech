// 1. Write a program to create circle class with area function to find area of circle. [A]

import java.util.*;
class Circle {
    double area(int r){
        return (Math.PI * r * r); 
    }
}
public class AreaCount {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Enter Value:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of circle is: "+c.area(r));
    }
}
