import java.util.*;
public class MaxAreaInHistogram {  // hard level
    public static void MaxArea(int heights[]) { // T.c = O(n) = optimized 
        int MaxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        // Next Smaller Right = O(n)
        Stack<Integer> s = new Stack<>();
        for (int i=heights.length-1; i>=0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Left = O(n)
        s = new Stack<>();
        for (int i=0; i<heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Curnn area Area : width = j-i-1 = nsr[i] - nsl[i] - 1; = O(n)
        for (int i=0; i<heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int CurrnArea = height * width;
            MaxArea = Math.max(CurrnArea, MaxArea);
        }
        System.out.println("Max Area in histogram is : " + MaxArea);
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        // int heights[] = {2,4};
        MaxArea(heights);
    }
}
