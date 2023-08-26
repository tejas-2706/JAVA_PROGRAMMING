package Linked_List;
import java.util.*;
// Intersection of Two Linked Lists 
// In a system there are two singly linked list. By some programming error, the end node of one
// of the linked lists got linked to the second list, forming an inverted Y-shaped list. 
// Write a program to get the point where two linked lists merge.
// We have to find the intersection part in this system.

import javax.sql.rowset.spi.SyncResolver;
public class LinkedListQn {
    // static class Node {
    //     int data;
    //     Node next;
    //     Node(int data) {
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // public Node GetInsertionNode(Node head1, Node head2) {
    // }
    public static void main(String[] args) {
        // LinkedListQn list = new LinkedListQn();
        // Node head1, head2;
        // head1 = new Node(10);
        // head2 = new Node(3);

        // Node newNode = new Node(6);
        // head2.next = newNode;
        
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        LinkedList<Integer> ll3 = new LinkedList<>();
        ll.add(8);
        ll.add(10);
        ll.add(12);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        // ll.add(9);
        printll(ll);
        OddEvenLL(ll, ll2, ll3);
        printll(ll2);
        printll(ll3);
        // System.out.println(head1);
    }
    public static void printll(LinkedList<Integer> ll) {
        for (int i=1; i<ll.size(); i++) {
            System.out.print(ll.get(i) + "->");
        }
        System.out.println("null");
    }
    public static void OddEvenLL(LinkedList<Integer> ll, LinkedList<Integer> ll2, LinkedList<Integer> ll3) {
        for (int i=0; i<ll.size(); i++) {
            if (ll.get(i) % 2 == 0) {
                ll2.add(i);
            }
            else {
                ll3.add(i);
            }
        }
    }
}
