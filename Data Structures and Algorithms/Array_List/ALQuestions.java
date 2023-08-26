package Array_List;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public interface ALQuestions {
    public static void main(String[] args) {
        // Container with most water 
        // for given n lines on x-axis, 
        // use 2 lines to form a container such that it holds maximum water.
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println(storewater(height));

        // linear approach
        System.out.println(storewaterlinearly(height));
    }
    // Linear Approach / pointer approach - T.C = O(n)
    public static int storewaterlinearly(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while (lp<rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp-lp;
            int currwater = ht * wt;
            maxwater = Math.max(maxwater, currwater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } 
            else {
                rp--;
            }
        }
        return maxwater;
    }
    // Brute approach - T.C = O(n^2)
    public static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        for (int i=0; i<height.size(); i++) {
            for (int j=0; j<height.size(); j++) {
                int hi = Math.min(height.get(i), height.get(j));
                int wi = j-i;
                int watercapacity = hi * wi;
                maxwater = Math.max(maxwater, watercapacity);
            }
        }
        return maxwater;
    }
}
