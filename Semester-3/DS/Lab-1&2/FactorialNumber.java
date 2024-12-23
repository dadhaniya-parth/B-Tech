//4. w.a.p. to find  factorial of a number(using loop).

import java.util.*;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial is:"+fact);
    }
}
