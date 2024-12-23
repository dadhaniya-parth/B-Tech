// 52. Write a menu driven program to implement following operations on the 
// Doubled Ended Queue using an Array 
//  Insert at front end, Insert at rear end 
//  Delete from front end, Delete from rear end 
//  Display all elements of the queue

import java.util.Scanner;

public class Deque {
    private int[] deque;
    private int front, rear, size, capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFront(int element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert element.");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        deque[front] = element;
        size++;
        System.out.println("Inserted " + element + " at front");
    }

    public void insertRear(int element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert element.");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        deque[rear] = element;
        size++;
        System.out.println("Inserted " + element + " at rear");
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete element.");
            return;
        }
        System.out.println("Deleted " + deque[front] + " from front");
        front = (front + 1) % capacity;
        size--;
        if (isEmpty()) {
            front = -1;
            rear = 0;
        }
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete element.");
            return;
        }
        System.out.println("Deleted " + deque[rear] + " from rear");
        rear = (rear - 1 + capacity) % capacity;
        size--;
        if (isEmpty()) {
            front = -1;
            rear = 0;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        System.out.print("Deque elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(deque[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the deque: ");
        int capacity = scanner.nextInt();
        Deque deque = new Deque(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front");
            System.out.println("2. Insert at rear");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete from rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at front: ");
                    int frontElement = scanner.nextInt();
                    deque.insertFront(frontElement);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at rear: ");
                    int rearElement = scanner.nextInt();
                    deque.insertRear(rearElement);
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
