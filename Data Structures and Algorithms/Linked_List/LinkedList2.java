package Linked_List;

public class LinkedList2 {
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
        if (head == null || head.next == null) {
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
        return true;
    }
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle() {
        // detect cycle
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
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        // remove cycle
        prev.next = null;

    }

    // Merge sort code
    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node MergeSort(Node head) {
        // base case 
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getmid(head);
        // ḷeft & right ms
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = MergeSort(head);
        Node newright = MergeSort(righthead);

        return merge(newleft, newright);
    }

    // zigzag
    public void ZigZag() {
        // finding Mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alt merge 
        Node lefthead = head;
        Node righthead = prev;
        Node nextL; Node nextR;
        while (lefthead != null && righthead != null) {
            nextL = lefthead.next;
            lefthead.next = righthead;
            nextR = righthead.next;
            righthead.next = nextL;
            // update LH and RH
            lefthead = nextL;
            righthead = nextR;
        }

    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.printll();
        // ll.head = ll.MergeSort(ll.head);  // T.C = O(n*logn)
        ll.ZigZag();
        ll.printll();





        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = temp;
        // 1->2->3->2
        // printll();
        // System.out.println(ll.CheckPalindrome()); 
        // T.C = O(n)  S.C = O(1)
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
    }
}
