// 2. Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the operation given in a string on the given numbers.[A]

import java.util.*;
public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        System.out.println("Enter Operation:");
        char choice = sc .next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("Add :"+(a+b));
                break;

            case '-':
                System.out.println("Sub :"+(a-b));
                break;

            case '*':
                System.out.println("Mul :"+(a*b));
                break;

            case '/':
                System.out.println("Div :"+(a/b));
                break;

            case '%':
                System.out.println("Mod :"+(a%b));
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        } 
    }
}
