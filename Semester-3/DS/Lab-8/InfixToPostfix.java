// 45. Write a program to convert infix notation to postfix notation using stack.

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            result.append(stack.pop());
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        InfixToPostfix converter = new InfixToPostfix();
        Scanner sc = new Scanner(System.in);
        String expression;
        System.out.println("Enter an infix expression:");
        expression = sc.nextLine();
        System.out.println("Postfix Expression: " + converter.infixToPostfix(expression));
    }
}
