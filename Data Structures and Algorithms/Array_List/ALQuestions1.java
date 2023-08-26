package Array_List;
import java.util.ArrayList;
public class ALQuestions1 {
    // Brute force - T.C = O(n^2)
    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        for (int i=0; i<list.size(); i++) {
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    // linear 2 ptr approach - T.C = O(n)
    public static boolean pairsum1_by_ptr(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (lp + rp == target) {
                return true;
            }
            else if (lp + rp < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    // linear pair sum 2 - T.C = O(n)
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int pivot = -1;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                pivot = i; 
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;
        while (lp!=rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if (list.get(lp) + list.get(rp) < target ) {
                lp = (lp+1) % list.size();
            }
            else {
                rp = (list.size()+rp-1) % list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // int target = 5;
        // System.out.println(pairsum1(list,target));  // Brute force - T.C = O(n^2)
        // System.out.println(pairsum1_by_ptr(list, target));  // linear 2 ptr approach - T.C = O(n)
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairsum2(list, target)); // linear time complexcity
    }
}
