package dsa.linkedlist;

public class LinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtMiddle(int data, int pos) {
        if (pos == 0 && head == null) {
            head = new Node(data);
        } else if (pos==0) {
            insertAtStart(data);
        } else {
            Node current = head;
            int count = 0;
            while (current != null) {
                if (count == pos - 1) {
                    Node temp = current.next;
                    Node newNode = new Node(data);
                    current.next = newNode;
                    newNode.next = temp;
                    break;
                }
                count++;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtStart(1);
        list.insertAtStart(3);
        list.insertAtMiddle(200, 0);
        list.insertAtMiddle(400, 1);
        list.display();
    }
}