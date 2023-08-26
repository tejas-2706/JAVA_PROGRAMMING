package Linked_List;
import java.util.LinkedList;
public class LinkedList3 {
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
        // create  - objects 
        LinkedList3 ll = new LinkedList3();
        // add
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        System.out.println(ll);
        ll.ZigZag();
        System.out.println(ll);
    }
}
