import java.util.*;
public class Activity_Selection { 
    public static void Activity_Selection_Without_Sorting(int start[], int end[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivity = 1;
        ans.add(0);

        int LastEnd = end[0];

        for (int i = 0; i < end.length; i++) {
            if (start[i] >= LastEnd) {
                maxActivity++;
                ans.add(i);
                LastEnd = end[i];
            }
        }
        System.out.println("Maximum Activity = " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }


    public static void Activity_Selection_With_Sorting(int start[], int end[]){
        // 2d array 
        int Activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            Activities[i][0] = i;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }

        // Lambda function for sorting 
        Arrays.sort(Activities, Comparator.comparingDouble(o -> o[2]));

        // same code with some changes 
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxActivity = 1;
        ans.add(Activities[0][0]);

        int LastEnd = Activities[0][2];

        for (int i = 0; i < end.length; i++) {
            if (Activities[i][1] >= LastEnd) {
                maxActivity++;
                ans.add(Activities[i][0]);
                LastEnd = Activities[i][2];
            }
        }
        System.out.println("Maximum Activity = " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int start[] = { 0, 1, 3, 5, 5, 8 };

        // int start[] = {1,3,0,5,8,5};
        // int end[] = { 2, 4, 6, 7, 9, 9 };

        int end[] = {6,2,4,7,9,9};
        // Activity_Selection_Without_Sorting(start,end); // without having functionality of sorting process 

        Activity_Selection_With_Sorting(start,end); //with having functionality of sorting process 
    }
}