// 2. w.a.p. to find whether a number is odd or even.

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
