// 48. Write a program for evaluation of prefix Expression using Stack.

import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluation {
    public int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0'); 
            }
            else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrefixEvaluation evaluator = new PrefixEvaluation();
        String expression;
        System.out.println("Enter Expression:");
        expression = sc.nextLine();
        System.out.println("Evaluation Result: " + evaluator.evaluatePrefix(expression));
    }
}
 