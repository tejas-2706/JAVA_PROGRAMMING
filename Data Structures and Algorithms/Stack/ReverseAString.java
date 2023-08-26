import java.util.Stack;

public class ReverseAString {
    // Reverse a string using a stack
    public static String ReverseOfString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void PrintStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void PushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    // Reverse A Stack
    public static void ReverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        ReverseStack(s);
        PushAtBottom(s, top);
    }
    public static void main(String[] args) {
        String str = "insaan";
        System.out.println(ReverseOfString(str));
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // PrintStack(s);
        ReverseStack(s);
        PrintStack(s);
    }
}
