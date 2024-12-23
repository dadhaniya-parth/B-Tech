// 47. Write a program for evaluation of postfix Expression using Stack.

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

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
        PostfixEvaluation evaluator = new PostfixEvaluation();
        String expression;
        System.err.println("Enter Expression:");
        expression = sc.nextLine();
        System.out.println("Evaluation Result: " + evaluator.evaluatePostfix(expression));
    }
}
