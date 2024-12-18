// 39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a program to solve the above problem.

import java.util.Scanner;
import java.util.Stack;

public class StringRecognizer {
    
    public boolean checkStrIsRecognize(String str){
        Stack<Character> stack = new Stack<>();
        char temp;
        boolean res=false;
        int flag=0;
        System.out.println(str);
    
        for(char c : str.toCharArray()){
            if(flag==1){
                temp=stack.pop();
                if(temp==c){
                    res=true;
                }else{
                    res=false;
                }
            }else if(c=='a' || c=='b'){
                stack.push(c);
            }else if(c=='c'){
                flag=1;
                continue;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringRecognizer r = new StringRecognizer();
        if(r.checkStrIsRecognize(input)){
            System.out.println("String is recognize");
        }else{
            System.out.println("String is not recognize");
        }
    }
}