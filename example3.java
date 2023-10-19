public class example3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }

        // print
        public static void stackUsingLinkedListPrint() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

    }

    public static void main(String[] args) {
        Stack sc = new Stack();
        System.out.println(sc.pop());
        System.out.println(sc.peek());
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.stackUsingLinkedListPrint();
        sc.stackUsingLinkedListPrint();
    }
}
