//3. w.a.p. to determine whether the entered character is vowel or not.


import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);
        if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("It is Vowel");
        } else {
            System.out.println("It is Not Vowel");
        }
    }
}
