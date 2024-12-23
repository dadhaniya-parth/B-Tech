// 5. Write a program that prompts the user to enter three numbers. Find the largest number.[C]

import java.util.*;
public class LargeOutThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println(n1+" is Large");
        }
        else if (n2>n1 && n2>n3) {
            System.out.println(n2+" is Large");
        }
        else{
            System.out.println(n3+" is Large");
        }
    }
}
