// 8. Write a program to print prime numbers between given range. [C]   

import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting Number:");
        int n1 = sc.nextInt();

        System.out.println("Enter Ending Number:");
        int n2 = sc.nextInt();

        System.out.println("Prime Number are:");
        for (int i = n1; i <= n2; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    }
                    }
    }
}
