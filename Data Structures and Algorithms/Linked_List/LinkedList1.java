package Linked_List;

public class LinkedList1 {
    public class Node {
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
    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;
        // base condition
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // main kutana 
        newnode.next = head;
        // step 3
        head = newnode;
    }
    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        // base condition
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // main kutana
        tail.next = newnode;
        // step 3
        tail = newnode;  
    }
    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } 
        System.out.println("null");
    } 
    // add in the middle
    public void add(int index, int data) {
        if (index == 0 ) {
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<size-1) {
            newnode.next = temp.next;
            temp.next = newnode;
            i++;
            return;
        }
    }
    // remove first
    public int removefirst() {
        // base case
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    // remove last
    public int removelast() {
        // base case 
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    } 
    // search for key
    public int SearchKey(int key) {
        // base case 
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
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
    public int helper(Node head, int key) { // O(n)
        // base case 
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx+1;
    }
    // recursive search
    public int recSearch(int key) {
        return helper(head, key);
    }

    // reverse linked list
    public void Reversell() {
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
    public void deleteNthnodefromend(int n) {
        // calculate size 
        int sz = 0;
        Node temp =  head;
        while(temp!=null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }
        // sz-n
        int i=1;
        int iTofind = sz-n;
        Node prev = head;
        while(i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // find mid node - by slow-fast approach
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }
    public boolean CheckPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }
        // find mid
        Node midNode = findMidNode(head);
        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head
        // check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(20);
        ll.addlast(13);
        ll.add(1, 300);
        ll.removefirst();
        // ll.removelast();
        ll.printll();
        // System.out.println("At Index " + ll.SearchKey(20));
        // System.out.println("At Index by recursive " + ll.recSearch(20));
        // System.out.println(ll.size);
        // ll.Reversell();
        // ll.printll();
        ll.deleteNthnodefromend(3);
        ll.printll();
        ll.CheckPalindrome();
    }
}
