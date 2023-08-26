import javax.swing.plaf.synth.SynthLookAndFeel;

public class RecurssionBasics {
    public static void PrintDec(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void PrintInc(int n){
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){   // TC - O(n) || SC - O(n)
        if (n == 0){
            return 1;
        }       
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static int calcsum(int n){  // TC - O(n)  SC - O(n)
        if (n==1){
            return 1;
        }
        int snm1 = calcsum(n-1);
        int sn = n + snm1;
        return sn;
    }
    // fibonaccci of nth term
    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            int fin_n_m_1 = fib(n-1);
            int fib_n_m_2 = fib(n-2);
            int fib_n = fin_n_m_1 + fib_n_m_2;
            return fib_n;
        }
    }
    // Given Array is sorted or not 
    public static boolean isSorted(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // WAF to find first occurence of an element in an array
    public static int FirstOccurence(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }
    // WAF to find last occurence of an element in an array
    public static int LastOccurence(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    // power x^n
    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;

        // return x * power(x, n-1);
    }
    public static void main(String[] args) {
        // Decreasing order by for loop
        // for (int i=10; i>=1; i--){
        //     System.out.print(i+" ");
        // }
        
        // Decreasing order by Recurssion
        // PrintDec(10);

        // Increasing order
        // PrintInc(5);

        // Factorial of n
        // int a = fact(5);
        // System.out.println(a);

        // n natural num sum
        // int n = 5;
        // System.out.println(calcsum(n));
        
        // print nth fibpnacci number
        // int n = 10;
        // System.out.println(fib(n));

        // Given Array is sorted or not 
        // int arr[] = {1,3,0,4,5};
        // System.out.println(isSorted(arr, 0));

        // WAF to find first occurence of an element in an array
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(FirstOccurence(arr, 5,0));

        // WAF to find last occurence of an element in an array
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurence(arr, 5, 0));

        // print x^n
        // System.out.println(power(2, 10));
    }
}