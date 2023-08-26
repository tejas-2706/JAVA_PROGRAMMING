import java.util.PriorityQueue;

public class QueueQuestion2 {
    public static int Nropes_MinCost(int a[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<a.length; i++){
            pq.add(a[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans = ans + sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        // int a[] = {1,2,3};
        int a[] = {4,3,2,6};
        System.out.println(Nropes_MinCost(a));
    }
}
