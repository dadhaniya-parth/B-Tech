// 56. Write a program to implement a node structure for singly linked list. Read the data in a node, print the node.


class SinglyLinkedList {
    static class Node {
        int data;       
        Node next;      
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node first;  

    public void add(int data) {
        Node newNode = new Node(data); 
        if (first == null) {            
            first = newNode;
        } else {                       
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {         
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.printList(); 
    }
}
