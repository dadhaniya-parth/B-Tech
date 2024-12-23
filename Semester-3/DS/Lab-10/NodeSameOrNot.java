// 59. WAP to check whether 2 singly linked lists are same or not.

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
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public boolean isEqual(LinkedList other) {
        Node current1 = this.head;
        Node current2 = other.head;
        
        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
    
        return current1 == null && current2 == null;
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class NodeSameOrNot {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        if (list1.isEqual(list2)) {
            System.out.println("The linked lists are equal.");
        } else {
            System.out.println("The linked lists are not equal.");
        }
        
        System.out.print("List 1: ");
        list1.printList();
        System.out.print("List 2: ");
        list2.printList();
    }
}

