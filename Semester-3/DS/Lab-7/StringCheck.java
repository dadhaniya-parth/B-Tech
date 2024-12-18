// 40. Write a program to determine if an input character string is of the form aibi where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.

import java.util.Scanner;
import java.util.Stack;
public class StringCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String s = sc.nextLine();
        int countA=0, countB=0;
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a'){
                stack.push(ch);
                countA++;
            }else if(ch == 'b'){
                stack.push(ch);
                countB++;
            }
        }
        
        if(countA == countB){
            System.out.println("The string is of the form a^i b^i");
        } else {
            System.out.println("The string is not of the form a^i b^i");
        }
    }
}
