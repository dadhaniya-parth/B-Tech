// 38. Write a menu driven program to implement following operations on the Stack using an Array
//  PUSH, POP, DISPLAY
//  PEEP, CHANGE

import java.util.Scanner;

public class StackArray {
    private int[] stack;
    private int top;
    private int size;

    public StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = element;
            System.out.println(element + " pushed onto the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public void peep() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    public void change() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the new value for the top element: ");
            int newValue = scanner.nextInt();
            stack[top] = newValue;
            System.out.println("Top element changed to: " + newValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        StackArray stack = new StackArray(size);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peep");
            System.out.println("5. Change");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.peep();
                    break;
                case 5:
                    stack.change();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}