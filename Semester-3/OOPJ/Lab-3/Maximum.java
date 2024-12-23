// 4. Write a program to find maximum no from given 3 no.(without if-else).[A]

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = ((a>b && a>c)?a:(b>c)?b:c);
        System.out.println("Max="+max);
    }
}
