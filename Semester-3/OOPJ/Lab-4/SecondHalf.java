// 4. Write a program to find length of string and print second half of the string.[B]

import java.util.*;
public class SecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        System.out.println("Length of the string: " + length);

        int startIndex = length / 2;

        String secondHalf = str.substring(startIndex);
        System.out.println("Second half of the string: " + secondHalf);
    }
}
