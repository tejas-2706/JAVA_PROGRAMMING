import java.util.LinkedList;
import java.util.*;
public class QueueQuestion1 { // O(n) both time and space
    // Question 1 :
    // Generate Binary NumbersGivenanumberN.
    // Thetaskistogenerateandprintallbinarynumberswithdecimalvaluesfrom1 to N.
    // Sample Input 1: N =2 .Sample Output 1: 1 10
    // Sample Input 2: N =5. Sample Output 2: 1 10 11 100 101

    public static void generatePrintBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=1; i<=n; i++){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        generatePrintBinary(n);
    }
}
