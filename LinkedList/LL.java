package LinkedList;

import java.util.LinkedList;

public class LL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);

        // Base Case
        if (head == null) {
            size++;
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add Last
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = null;
            size++;
            return;
        }
        tail.next = newNode;
        size++;
    }

    // ToPring LinkedList
    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.print("null\n");
    }

    public static void addMiddle(int data, int idx) {
        Node newNode = new Node(data);
        if (head == null) {
            size++;
            head = tail = null;
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove Element
    public static void removeFirst() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }

        head = head.next;
        size--;
    }

    public static void removeLast() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }

        int i = 0;
        Node temp = head;

        while (i < size - 2) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static boolean iterativeSearchLL(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static int recursiveSearchLL(int key) {
        return recursiveSearchLLHelper(head, key);
    }

    public static int recursiveSearchLLHelper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int index = recursiveSearchLLHelper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    // Reverse A Linked List
    public static void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete Nth Node from End
    public static void deleteNthNodeFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    // Check Palindrome
    public static boolean checkLLPalindrome() {
        // Check Base Case
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 find the mid using fast and slow
        Node midNode = findMidNode(head);

        // Step 2: Reverse 2nd Half

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Check Left Half with Right Half
        Node left = head;
        Node right = prev; // Right half Head

        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle exists
            }
        }
        return false; // Cycle doesn't exists
    }

    public static void removeCycle() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // Find meeting Point
        slow = head;
        Node prev = null; // Last Node

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove Cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        // ll.printLL();

        // // ADD Operations

        // ll.addFirst(1);
        // ll.printLL();

        // ll.addLast(2);
        // ll.printLL();

        // ll.addMiddle(0, 1);
        // ll.printLL();

        // System.out.println("Linked List size: " + size);

        // // REMOVE Operations
        // ll.removeFirst();
        // ll.printLL();

        // ll.removeLast();
        // ll.printLL();
        // System.out.println(iterativeSearchLL(9));
        // System.out.println(recursiveSearchLL(2));

        // ll.reverseLL();
        // ll.printLL();

        // ll.deleteNthNodeFromEnd(3);
        // ll.printLL();

        // System.out.println(checkLLPalindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
