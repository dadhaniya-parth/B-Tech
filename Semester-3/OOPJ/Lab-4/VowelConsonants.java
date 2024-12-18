// 1.Write a program to accept a line and check how many consonants and vowels are there in line.

import java.util.*;
public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String line = sc.nextLine();
        check(line);
    }
    static void check(String line){
        int vowel = 0, consonant = 0;
        int n = line.length();
        for (int i = 0; i < n; i++) {
            char ch = line.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='u') {
                vowel++;
            }
        }
        consonant = n - vowel;
        System.out.println("Number of vowels: "+vowel);
        System.out.println("Number of consonants: "+consonant);
    }
}