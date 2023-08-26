import java.util.*;
public class StackUsingDeque {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data){
            dq.addFirst(data);
        }
        public int pop(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        // System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());        
    }
}
