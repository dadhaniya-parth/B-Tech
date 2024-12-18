// 6. Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.[B]

import java.util.*;
public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);

        letter = Character.toLowerCase(letter);
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        } 
    }
}
