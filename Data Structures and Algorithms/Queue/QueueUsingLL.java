package Queue;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            else{
                tail.next = newNode;
                tail = newNode;
                return;
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            } 
            int front = head.data;
            //single ele
            if(head==tail){
                head = tail = null;
            }
            else {
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            } 
            return head.data;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
