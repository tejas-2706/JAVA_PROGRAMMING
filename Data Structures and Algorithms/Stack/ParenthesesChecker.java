import java.util.*;
public class ParenthesesChecker {
    // Checking valid Parentheses 
    public static boolean isValidParentheses(String str) { // O(n)
        Stack<Character> s = new Stack<>();
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening 
            if ('(' == ch|| '[' == ch|| '{' == ch) {
                s.push(ch);
            }
            // closing 
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')'|| 
                    s.peek() == '[' && ch == ']'|| 
                    s.peek() == '{' && ch == '}') {
                        s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    // Duplicate Parentheses 
    public static boolean isDuplicateParentheses(String str2) {
        Stack<Character> s = new Stack<>();
        for (int i=0; i<str2.length(); i++) {
            char ch = str2.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }
                else {
                    s.pop();
                }
            } 
            // opening
            else {
                s.push(ch);
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        // String str = "({[()]})";
        // System.out.println(isValidParentheses(str));
        String str2 = "(((a+b)+(c+(d)+e)))";
        System.err.println(isDuplicateParentheses(str2));
    }
}
