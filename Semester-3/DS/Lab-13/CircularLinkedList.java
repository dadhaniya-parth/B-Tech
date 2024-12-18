// 71. Write a menu driven program to implement following operations on the
// circular linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list.
//  Display all nodes.


import java.util.Scanner;

class CircularLinkedlist
{
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

            switch(choice) 
            {
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
                    loop=false;
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
    Node link;
    Node first;
    Node last;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    void insertAtFirst() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        Node x = new Node(data);
        if(first==null)
        {
            first = x;
            last = x;
            displayNode();
            return;
        }
        x.link = first;
        first = x;
        displayNode();
    }
    
    void insertAtLast() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        Node x = new Node(data);
        if (first == null) 
        {
            first = x;
            last = x;
            displayNode();
            return;
        }
        x.link = first;
        last.link = x;
        last = x;
        displayNode();
    }
    
    void deleteAtPosition() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int pos = sc.nextInt();
        if (first == null) 
        {
            System.out.println("Empty Link list");
            return;
        }
        if (pos == 1) 
        {
            first = first.link;
            displayNode();
            return;
        }
        if(pos  == 2) 
        {
            first.link = first.link.link;
            displayNode();
            return;
        }
        Node current = first;
        while (pos > 2) 
        {
            current = current.link;
            System.out.println(current.data);
            pos--;
        }
        current.link = current.link.link;
        displayNode();
    }
    
    void displayNode() 
    {
        if (first == null) 
        {
            System.out.println("Empty Link list");
            return;
        }
        Node current = first;
        while (current != last) 
        {
            System.out.print(" | " + current.data);
            current = current.link;
        }
    }
}


