public class DivideConquer_qns {
// Question1:
    // Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase). (EASY)
    // Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
    // Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
    public static String[] mergesort(String arr[], int lo, int hi) {
        // Base case
        if (lo == hi) {
            String A[] = {arr[lo]};
            return A;
        }
        int mid = lo + (hi - lo)/2;
        // kaam
        String arr1[] = mergesort(arr, lo, mid);
        String arr2[] = mergesort(arr, mid+1, hi);

        String arr3[] = merge(arr1, arr2);
        return arr3;
    }
    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        String arr3 [] = new String[m + n];
        int indx = 0; // index for temp array 3

        int i = 0; // index for arr1
        int j = 0; // index for arr2

        while (i < m && j < n) {
            if (isAlphabeticallysmaller(arr1[i], arr2[j])) {
                arr3[indx] = arr1[i];
                indx++; 
                i++;
            }
            else {
                arr3[indx] = arr2[j];
                indx++;
                j++;
            }
        } 
        while (i < m ){
            arr3[indx] = arr1[i];
            indx++; 
            i++;
        }
        while (j < n) {
            arr3[indx] = arr2[j];
            indx++;
            j++;
        }
        return arr3;
    }
    public static boolean isAlphabeticallysmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }
// Question 2 :
    // Given an array nums of size n, returnthe majority element. (MEDIUM)
    // The majority element is the element that appears more than⌊n/2⌋times.
    // You may assume that the majority element always exists in the array.
    // Sample Input 1: nums = [3,2,3]
    // Sample Output 1: 3
    // Sample Input 2: nums = [2,2,1,1,1,2,2]
    // Sample Output 2: 2
    public static int majorityelement(int nums[]) { // Brute force approach
        int count = 0;
        int majority_element = nums.length/2;
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majority_element) {
                return nums[i];
            }
        }
        return -1;
    }
    public static int majorityelement_approach2(int nums[]) {
        return -1;
    }

    // main function
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        // String a[] =  mergesort(arr, 0, arr.length-1);
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }

    // 2)
        int nums[] = {3,2,3};
        System.out.println(majorityelement(nums));
    }
}





