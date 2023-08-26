// import java.util.Scanner;
import java.io.*;
import java.util.*;
// Question 2 :
/*Keypad Combinations Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. 
You can print the answer in any order.
A mapping of digits to letters(just like on the telephone buttons)is given below. Note that 1does not map to any letters. */
public class Qn2_keypad_combinations {
    // public static int keypadCombo(String digits, int index, String mapping, String ans) {
    //     // base case 
    //     if (index >= digits.length()) {
            
    //     }
    //     int numbers = digits[i] - '0';
    //     for (int i=0; i<) {
    //         // recurssion
    //         // backtracking level
    //     }
    //     return ans;
    // }
    public static void print_KP_C(String ques, String ans) {
        // base case 
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String mapp = mapping[ch - '0'];
        for (int i=0; i < mapp.length(); i++) {
            char cho = mapp.charAt(i);
            print_KP_C(roq, ans + cho);
        }
    }
    static String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits : ");
        String str = sc.next();
        // String ques = "";
        print_KP_C(str, "");        
    }
}
