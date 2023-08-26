package Linked_List;

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        // Base case
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    public void removeFirst() {
        // Base case
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void printdll() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is empty ");
        }
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        // Base condition
        if (tail == null) {
            System.out.println("LL is empty");
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }
    public void removeLast() {
        // Base condition 
        if (tail == null) {
            System.out.println("LL is empty");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public void reverse() {
        Node currn = head;
        Node prev = null;
        Node next;

        while (currn != null) {
            next = currn.next;
            currn.next = prev;
            currn.prev = next;

            prev = currn;
            currn = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.printdll();
        // dll.removeFirst();
        // dll.printdll();
        // dll.addLast(20);
        // dll.addLast(30);
        // dll.printdll();
        // dll.removeLast();
        dll.reverse();
        dll.printdll();
        System.out.println(dll.size);
    }
}
