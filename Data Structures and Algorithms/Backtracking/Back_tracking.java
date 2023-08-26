public class Back_tracking {
    // backtracking on arrays
    public static void changearr(int arr[], int i, int val){
        // base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changearr( arr, i+1, val+1); // fnx call step
        arr[i] = arr[i] - 2;   //  backtracking step  
    }
    public static void printarr(int arr[]) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // subsets of string
    public static void subsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("NULL");
            }
            else { 
                System.out.println(ans);
            }
            return;
        }
        // recurssion case 

        // yes condition
        subsets(str, ans+str.charAt(i), i+1);
        // no condition 
        subsets(str, ans, i+1);
    }

    // find permutations 
    public static void permutation(String str, String ans) {
        // base case 
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recurssion tc - O(n * n!)
        for (int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i+1, str.length());
            permutation(newstring, ans+curr);
        }
    }

    // N-Queens
    
    public static void main(String args[]){
        // int arr[] = new int[5];
        // changearr(arr,0,1);
        // printarr(arr);

        String str = "abc";
        // subsets(str, "", 0);

        permutation(str, "");
    } 
}

