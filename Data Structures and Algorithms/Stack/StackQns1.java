
// Question 2 :
// Simplify PathWehavaanabsolutepathforafile(Unix-style),simplifyit.
// Notethatabsolutepathalwaysbeginwith‘/’(rootdirectory),
// adotinpathrepresentcurrentdirectoryanddoubledotrepresentsparent directory.
// Sample Input 1: /apnacollege/Sample Output 1: /apnacollegeSample 
// Input 1: /a/..Sample Output 1: /
import java.util.*;
// public class StackQns1 {
//     public static String simplifyit(Stack<String> s, String path) {
//         Stack<String> s = new Stack<>();
//         StringBuilder res = new StringBuilder();
//         String[] str = path.split("/");

//         for (int i=0; i<str.length; i++) {
//             if(!s.isEmpty() && str[i]=="..") s.pop();
//             else if(str[i]!="" && str[i]!="." && str[i]!="..") s.push(str[i]);
//         }

//         if(s.isEmpty()) return "/";
//         while (!s.isEmpty()) {
//             res.insert(0,s.pop()).insert(0,"/");
//         }
//         return res.toString();
//     }
//     public static void main(String[] args) {
//         Stack<String> s = new Stack<>();
//         String path = "/apnacollege/";
//         System.out.println(simplyfyit(s,path));
        
//     }
// }




import java.util.Stack;

public class StackQns1 {
    public static String simplifyit(Stack<String> s, String path) {
        StringBuilder res = new StringBuilder();
        String[] str = path.split("/");

        for (int i = 0; i < str.length; i++) {
            if (!s.isEmpty() && str[i].equals(".."))
                s.pop();
            else if (!str[i].equals("") && !str[i].equals(".") && !str[i].equals(".."))
                s.push(str[i]);
        }

        if (s.isEmpty())
            return "/";

        while (!s.isEmpty()) {
            res.insert(0, s.pop()).insert(0, "/");
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        String path = "/apnacollege/";
        System.out.println(simplifyit(s, path));
    }
}
