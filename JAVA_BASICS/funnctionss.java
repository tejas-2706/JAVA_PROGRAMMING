import java.util.Scanner;

public class funnctionss {
    public static void printhelloworld(){
        System.out.println("Hello World");
    }

    public static int sum(int a,int b){   // Parameters or formal Parameters
        int sum = a+b;
        return sum;
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static int multiplication(int a,int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
        return f; // factorial of n
    }

    public static int BinCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);
        int fact = (n_fact/(r_fact*n_r_fact));
        return fact;
    }
// Check if a number is prime or not
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        boolean isPrime = true;
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPrimeOptimized(int n){
        if (n == 2){
            return true;
        }
        // for (int i=2;i<=(n/2)-1;i++){     //without using math and also optimized
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimesInRange(int n){
        for (int i=2; i<=n; i++){
            if (isPrimeOptimized(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void BinNum(int BinNum){
        int MyBinNum = BinNum;
        int pow = 0;
        int decNum = 0;

        while (BinNum > 0) {
            int Lastdigit = BinNum%10;
            decNum = decNum + (Lastdigit * (int) Math.pow(2, pow));
            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal of "+MyBinNum+" = "+decNum);
    }

    public static void DecToBin(int n){
        int my_n = n;
        int pow = 0;
        int BinNum = 0;

        while (n>0){
            int rem = n%2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));         
            pow++;
            n = n/2;
        }
        System.out.println("Binary of "+my_n + " = " + BinNum);
    }

    public static void main(String args[]){
        // printhelloworld();

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = sum(a,b);                // Arguments or actual arguments 
        // System.out.println("sum is:- "+ sum);

        /*int a = 5;
        int b = 10;
        swap(a,b);*/
        // System.out.println(a); -----when print here the values are of main not of the function
        // System.out.println(b);                 JAVA ALWAYS CALLS BY VALUE------

        /*int prod = multiplication(2, 4);
        System.out.println("a*b = "+ prod);*/

        // System.out.println("factorial = "+factorial(4));

        // System.out.println("Binomial Coefficient = " + BinCoeff(5,2));

        // System.out.println("isPrime = " + isPrime(12));

        // System.out.println("isPrime Optimized Method = " + isPrimeOptimized(7));

        // PrimesInRange(100);

        // BinNum(101110);

        DecToBin(37);
    }



}
