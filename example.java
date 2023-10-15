
public class example {
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

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        ;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public static void addMiddle(int data, int idx) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public static void removeLast() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void printLinkedList() {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int recursiveSearch(int key) {
        return recursiveSearchHelper(head, key);
    }

    public static int recursiveSearchHelper(Node head, int key) {
        // Base Case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        // Logic
        int idx = recursiveSearchHelper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        // Backtracking
        return idx + 1;
    }

    public static void reverseLinkedList() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        example ll = new example();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.addMiddle(0, 5);
        ll.removeFirst();
        ll.removeLast();
        ll.printLinkedList();
        System.out.println();

        System.out.println(ll.iterativeSearch(1));
        System.out.println(ll.recursiveSearch(1));
        ll.reverseLinkedList();
        ll.printLinkedList();
    }
}
