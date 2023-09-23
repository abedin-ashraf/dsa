package LinkedList;

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
    public static int size;

    public void addFirst(int data) {
        // Step 1 //Create a new Node
        Node newNode = new Node(data);
        size++;
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
        size++;

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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    // Add in middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;

    }

    // Iterative Search
    public static int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // Key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Key not found
        return -1;
    }

    public static int recursiveSearchHelper(Node head, int key) {
        // Base case
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

    public static int recursiveSearch(int key) {
        return recursiveSearchHelper(head, key);
    }

    // Reverse a Linked List
    public void reverse() {
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

    public void deleteNthFromEnd(int n) {
        // Calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next; // Remove First
            return;
        }

        // Size - n
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

    // Check if a Linked List is Palindrome
    public boolean checkPalindrome() {
        // Base Case
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 - find Mid Node
        Node midNode = findMid(head);

        // Step 2 - Reverse the 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // Rigth half head
        Node left = head;

        // Step 3 - check left half with right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.add(3, 3);

        ll.printLinkedList();

        // System.out.println("Size: " + ll.size);
        // System.out.println("Removed firstElement: " + ll.removeFirst());
        // System.out.println("After removing first element: ");
        // ll.printLinkedList();

        // System.out.println("Removed lastElemet: " + ll.removeLast());

        // System.out.println("After removing last element ");
        // ll.printLinkedList();

        // System.out.println("Iterative Serach: ");

        // System.out.println("Index:" + iterativeSearch(3));

        // System.out.println("Recursive search: ");
        // System.out.println(recursiveSearch(4));

        // System.out.println("reverse linked list: ");
        // ll.reverse();
        // ll.printLinkedList();

        // ll.deleteNthFromEnd(5);
        // ll.printLinkedList();

        System.out.println(ll.checkPalindrome());

    }
}
