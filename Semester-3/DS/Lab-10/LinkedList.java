// 57. Write a menu driven program to implement following operations on the singly linked list.
//  Insert a node at the front of the linked list.
//  Display all nodes.
//  Delete a first node of the linked list.
//  Insert a node at the end of the linked list.
//  Delete a last node of the linked list.
//  Delete a node from specified position.

import java.util.*;

class Node {
    int data;
    Node next;
    Node nextnext;

    Node()
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private static Node head;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 8) {
            System.out.println(
                    "\n1.Insert in beginning\n2.Insert at last\n3.Insert item at any location\n4.Delete from Beginning\n5.Delete from last\n6.Delete item from any location\n7.Show\n8.Exit\n");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    beginInsert();
                    break;
                case 2:
                    lastInsert();
                    break;
                case 3:
                    randomInsert();
                    break;
                case 4:
                    beginDelete();
                    break;
                case 5:
                    lastDelete();
                    break;
                case 6:
                    randomDelete();
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice..");
            }
        }
    }

    private static void beginInsert() {
        Node ptr = new Node();
        System.out.print("\nEnter value: ");
        ptr.data = scanner.nextInt();
        ptr.next = head;
        head = ptr;
        System.out.println("Item inserted");
        display();
    }

    private static void lastInsert() {
        Node ptr = new Node();
        System.out.print("\nEnter value: ");
        ptr.data = scanner.nextInt();
        ptr.next = null;

        if (head == null) {
            head = ptr;
            System.out.println("Item inserted");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
            System.out.println("Item inserted");
            display();
        }
    }

    private static void randomInsert() {
        int loc;
        System.out.print("Enter Value: ");
        Node ptr = new Node();
        ptr.data = scanner.nextInt();
        System.out.print("\nEnter the location: ");
        loc = scanner.nextInt();

        Node temp = head;
        Node pre = null;
        for (int i = 1; i < loc; i++) {
            pre = temp;
            temp = temp.next;
            if (temp == null) {
                System.out.println("\ncloan't insert\n");
                return;
            }
        }
        ptr.next = temp;
        pre.next = ptr;
        System.out.println("Item inserted");
        display();
    }

    private static void beginDelete() {
        if (head == null) {
            System.out.println("\nList is empty\n");
        } else {
            Node ptr = head;
            head = ptr.next;
            System.out.println("Item deleted from the beginning ...\n");
            display();
        }
    }

    private static void lastDelete() {
        if (head == null) {
            System.out.println("\nList is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("\nOnly node of the list deleted ..\n");
        } else {
            Node ptr = head;
            Node ptrl = null;
            while (ptr.next != null) {
                ptrl = ptr;
                ptr = ptr.next;
            }
            ptrl.next = null;
            System.out.println("Item deleted from the end ...\n");
            display();
        }
    }

    private static void randomDelete() {
        System.out.print("Enter Data : ");
        int pos = scanner.nextInt();
        if (head == null) {
            System.out.println("Empty Link list");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (pos > 2) {
            temp = temp.next;
            System.out.println(temp.data);
            pos--;
        }
        temp.next = temp.next;
        display(); 
    }

    private static void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
