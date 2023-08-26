import java.util.ArrayList;

public class ALQuestions2 {
    // ArrayList Questions
    // Question 1
    /*
     * Monotonic ArrayList (EASY)
     * An Arraylist is monotonic if it is either monotone increasing or monotone
     * decreasing.
     * An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <=
     * nums.get(j). An
     * Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >=
     * nums.get(j).
     * Given an integer Arraylist nums, return true if the given list is monotonic,
     * or false otherwise
     * Sample Input 1 : nums = [1,2,2,3]
     * Sample Output 1 : true
     * Sample Input 2 : nums = [6,5,4,4]
     * Sample Output 2 : true
     * Sample Input 3 : nums = [1,3,2]
     * Sample Output 3 : false
     * Constraints :
     * ● 1 <= nums.size() <= 105
     * ● -105 <= nums.get(i) <= 105
     */
    public static int Monotonic(ArrayList<Integer> nums) {
        for (int i=0; i<nums.size(); i++) {
            for (int j=i+1; j<j+1; j++) {
                // Monotone Increasing
                if (i<=j) {
                    if (nums.get(i) <= nums.get(j)) {
                        
                    }
                    else
               }
               // Monotone decreasing
               if (i<=j && nums.get(i) >= nums.get(j)) {
                
               }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(2);
        // nums.add(3);

        // nums.add(6);
        // nums.add(5);
        // nums.add(4);
        // nums.add(4);

        
        nums.add(1);
        nums.add(3);
        nums.add(2);
        System.out.println(Monotonic(nums));
    }
}
