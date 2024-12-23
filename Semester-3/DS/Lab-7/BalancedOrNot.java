// 41. Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now Chef wants to know if the given string is balanced or not. If is balanced then print 1, otherwise print 0.

import java.util.*;
class Stack{
    int top  =  -1;
    int n = 20;
    char[] arr = new char[n];

    public void push(char braket) {
        if (top >= n-1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = braket;
        }
    }

    public char pop() {
        if (top <= -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            top--;
            return arr[top + 1];
        }
    }
}

public class BalancedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string with brakets only");
		String str=sc.nextLine();
        boolean flag = true;
        int i = 0;

        Stack br = new Stack();     

        char ch=str.charAt(i);
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(str.length()%2 != 0){
                flag = false;
                break;
            }
            if(ch == '(' || ch == '{' || ch == '[' ){
                br.push(ch);
            }
            
            char x;
            if(ch ==')'){
                x=br.pop();
                if(x =='{' ||x =='['){
                    flag = false;
                    break;
                }  
            }
            else if(ch =='}'){
                x=br.pop();
                if(x =='(' ||x =='['){
                    flag = false;
                    break;
                }
            }
            else if(ch ==']'){
                x=br.pop();
                if(x =='{' ||x =='('){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("string is balanced");
        }
        else{
            System.out.println("string is not balanced");
        }
    }    
}