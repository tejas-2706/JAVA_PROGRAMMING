package Queue;
import java.util.*;
public class QueueUsingJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); //ArrayDeque
        Queue<Integer> q = new ArrayDeque<>(); 
        q.add(1);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
