import java.util.*;
// Question 1 :
// Maximum Balanced String PartitionsWehavebalancedstringstrofsizeNwithanequalnumberofLandR,
// thetaskistofindamaximumnumberX,suchthatagivenstringcanbepartitionedintoXbalancedsubstring.
// Astring is called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s.
// Input: “LRRRRLLRLLRL”Output: 3
public class Max_balance_str_partitions {
    // T.C = O(n)  S.C = O(n);
    public static void UsingStack(String str) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(s.isEmpty()){
                s.push(str.charAt(i));
                count++;
            }
            else if(s.peek() == str.charAt(i)){
                s.push(str.charAt(i));
            }else{
                s.pop();
            }
        }
        System.out.println("Max count of substring is = "+count);
    }

    // T.C = O(n)  S.C = O(1);
    public static void EfficientWay(String str){
        int n = str.length();
        int r = 0, l = 0;
        int ans = 0;
        if(n == 0){
            System.out.println("String is empty !!");
        }

        for(int i=0; i<n; i++){
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                ans++;
            }
        }
        System.out.println("The Max. balance Substring are = "+ ans);
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        // String str = "LRLLRRLRRL";
        UsingStack(str);
    
        EfficientWay(str);
    }
}
