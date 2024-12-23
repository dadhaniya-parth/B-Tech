// 72. Write a menu driven program to implement following operations on the doubly
// // linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list. (Home Work)
//  Display all nodes. (Home Work)

import java.util.Scanner;

class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, data;
        boolean loop = true;

        Node n = new Node(1);

        while (loop) {
            System.out.println("");
            System.out.println("Press 1 for Insert At First");
            System.out.println("Press 2 for Insert At Last");
            System.out.println("Press 3 for Delete At Specific Position");
            System.out.println("Press 4 for Display Link List");
            System.out.println("Press 5 to Exit");
            System.out.println("");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    n.insertAtFirst();
                    break;
                case 2:
                    n.insertAtLast();
                    break;
                case 3:
                    n.deleteAtPosition();
                    break;
                case 4:
                    n.displayNode();
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }

}

class Node {

    int data;
    Node lptr;
    Node rptr;
    Node L;
    Node R;

    public Node(int data) {
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }

    void insertAtFirst() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        Node x = new Node(data);
        if (L == null) {
            L = x;
            R = x;
            displayNode();
            return;
        }
        L.lptr = x;
        x.rptr = L;
        L = x;
        displayNode();
    }

    void insertAtLast() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        Node x = new Node(data);
        if (L == null) {
            L = x;
            R = x;
            displayNode();
            return;
        }
        R.rptr = x;
        x.lptr = R;
        R = x;
        displayNode();
    }

    void deleteAtPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int pos = sc.nextInt();
        if (R == null) {
            System.out.println("Empty Link list");
            return;
        }
        if (pos == 1) {
            L = L.rptr;
            L.lptr = null;
            displayNode();
            return;
        }
        if (pos == 2) {
            L.rptr = L.rptr.rptr;
            L.rptr.lptr = L;
            displayNode();
            return;
        }
        Node current = L;
        while (pos > 2) {
            current = current.rptr;
            pos--;
        }
        current.rptr = current.rptr.rptr;
        current.rptr.lptr = current;
        displayNode();
    }

    void displayNode() {
        if (R == null) {
            System.out.println("Empty Link list");
            return;
        }
        Node current = L;
        while (current != R) {
            System.out.print(" | " + current.data);
            current = current.rptr;
        }
    }
}