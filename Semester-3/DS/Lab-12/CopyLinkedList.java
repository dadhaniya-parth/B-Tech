// 63. Write a program to copy a linked list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    LinkedList copyList() {
        LinkedList copy = new LinkedList();
        Node current = head;
        while (current != null) {
            copy.insert(current.data);
            current = current.next;
        }
        return copy;
    }
}

public class CopyLinkedList {
    public static void main(String[] args) {
        LinkedList originalList = new LinkedList();
        originalList.insert(5);
        originalList.insert(4);
        originalList.insert(3);
        originalList.insert(2);
        originalList.insert(1);

        System.out.println("Original List:");
        originalList.print();

        LinkedList copiedList = originalList.copyList();

        System.out.println("Copied List:");
        copiedList.print();
    }
}