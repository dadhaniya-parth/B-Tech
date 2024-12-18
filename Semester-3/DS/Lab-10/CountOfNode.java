// 58. Write a program to count the number of nodes in a singly circularly linked list.
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class CountOfNode {
    Node push(Node last, int data) {
        if (last == null) {
            Node temp = new Node(data);
            temp.next = temp; 
            return temp;
        }

        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        return last;
    }

    int countNodes(Node head) {
        Node temp = head;
        int result = 0;
        if (head != null) {
            do {
                temp = temp.next;
                result++;
            } while (temp != head);
        }
        return result;
    }

    public static void main(String[] args) {
        CountOfNode list = new CountOfNode();
        Node head = null;
        head = list.push(head, 12);
        head = list.push(head, 56);
        head = list.push(head, 2);
        head = list.push(head, 11);

        System.out.println("Number of nodes: " + list.countNodes(head));
    }
}
