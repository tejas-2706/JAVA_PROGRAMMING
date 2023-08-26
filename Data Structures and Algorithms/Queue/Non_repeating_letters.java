package Queue;
import java.util.*;
public class Non_repeating_letters {
    public static void printNonRepeating(String str){
        int[] freq_count = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq_count[ch - 'a']++;
            
            while(!q.isEmpty() && freq_count[q.peek()-'a']>1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
