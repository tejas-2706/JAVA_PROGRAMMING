import java.util.*;
// Question 1 :
// Palindrome Linked ListWehaveasinglylinkedlistofcharacters,
// writeafunctionthatreturnstrueifthegivenlistisapalindrome,
//  else false.Input: A->B->C->B->AOutput: Yes It is Palindrome
public class StackQns {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven; 

        boolean condition = isPalindrome(one);
        System.out.println(condition);
    }

    static boolean isPalindrome(Node head){
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> s = new Stack<Integer>();
        while (slow!=null){
            s.push(slow.data);
            slow = slow.next;
        }

        while(head!=null){
            int i= s.pop();
            if(i==head.data){
                ispalin = true;
            }
            else {
                ispalin=false;
                break;
            }
            head=head.next;
        }
        return ispalin;
    }
}




