public class RecurssionBasics_qns {
    // Question1:
    // For a given integer array of size N. 
    // You have to find all the occurrences(indices) of a given element(Key) and print them.
    // Use a recursive function to solve this problem.
    public static int AllOcurrenceOfElement(int arr[], int key, int i) {
        // base case
        if(i == arr.length) {
            // System.out.print(i + " ");
            return 1;
        }
        // kaam
        if(arr[i] == key) {
            System.out.print(i + " ");
        }
        AllOcurrenceOfElement(arr, key, i+1);
        return i;
    }
    // Question 2 :
    // You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.
    // Use a recursive function to solve this problem.
    // NOTE-
    // The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
    // Sample Input:
    // 1947 Sample Output: “one nine four seven”
    static String Digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void NumToStrCoverter(int n) {
        if (n == 0) {
            return;
        }
        int lastdigit = n%10;
        NumToStrCoverter(n/10);
        System.out.print(Digits[lastdigit] + " ");
    }
    // Question 3 :
    // Write a program to find Length of a String using Recursion.
    public static int StrLength(String Str) {
        // int count = 0;
        if (Str.length() == 0) {
            return 0;
        }
        else {
            // count++;
            // char currChar = Str.charAt(idx);
            // // count++;
            // int len = StrLength(Str, idx+1);
            return StrLength(Str.substring(1)) + 1;
        }
        // return count;
        // System.out.println("COunt is " + count);
    }
    // Question4:
    // We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.
    public static int CountOFSubStrings() {
        return 0;
    }
    public static void TowerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Shift the " + n + " disk from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("Shift the " + n + " disk from " + src + " to " + helper);
        TowerOfHanoi(n-1, helper, src, dest);
        // System.out.println("Shift the " + n + " disk from " + helper + " to " + dest);
    }


    public static void main(String[] args) {

        // NumToStrCoverter(1230);
        // String Str = "Tejas";
        // System.out.println(StrLength(Str));
        TowerOfHanoi(2,"A", "B", "C");
    }
}