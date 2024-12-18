// 50. Write a menu driven program to implement following operations on the Queue 
// using an Array 
//  ENQUEUE 
//  DEQUEUE 
//  DISPLAY 

import java.util.Scanner;

public class QueueDemo {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
    int capacity;
  
    QueueDemo(int capacity) {
      this.capacity = capacity;
        items = new int[capacity];
        front = -1;
        rear = -1;
    }
  
    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
    void enQueue(int element) {
  
      if (isFull()) {
        System.out.println("Queue is full");
      }
      else {
        if (front == -1) {
          front = 0;
        }
  
        rear++;
        items[rear] = element;
        System.out.println("Insert " + element);
      }
    }
  
    int deQueue() {
      int element;
  
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      }
      else {
        element = items[front];
  
        if (front >= rear) {
          front = -1;
          rear = -1;
        }
        else {
          front++;
        }
        return (element);
      }
    }


    void display() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      }
      else {
  
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
      }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        QueueDemo queue = new QueueDemo(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enQueue(data);
                    break;
                case 2:
                    int dequeuedData = queue.deQueue();
                    if (dequeuedData != -1) {
                        System.out.println(dequeuedData + " dequeued.");
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}