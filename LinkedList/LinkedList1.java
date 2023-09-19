package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step 1 //Create a new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 //New Node next = pr
        newNode.next = head; // link

        // Step 3
        head = newNode;

    }

    public void addLast(int data) {
        // step 1
        Node newNode = new Node(data);

        // /Base Case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2
        tail.next = newNode;
        // Step 3
        tail = newNode;
    }

    // Print Linked List
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLinkedList();
    }
}
