import java.util.*;
public class doo_whilee {
    public static void main(String args[]){
        // int counter = 1;
        // do{
        //     System.out.println("hello world");
        //     counter++;
        // }while(counter <= 10);


      /*for (int i=1; i<=5; i++){
            if (i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of loop");*/

// Keep entering numbers till user enters a multiple of 10..        
        Scanner sc = new Scanner(System.in);
        /*while (true){
            System.out.println("Enter the number:- ");
            int take_num = sc.nextInt();
            if (take_num % 10 == 0){
                break;
            }
            else{
                System.out.println(take_num);
            }
        }*/

// here 3 is skipped 
        /*for (int n=1; n<=5; n++){
            if (n==3){
                continue;
            }
            System.out.println(n);
        }*/

// Display all numbers except multiples of 10
       /* do{
            System.out.println("Enter your number");
            int nm = sc.nextInt();
            if (nm%10==0){
                continue;
            }
            System.out.println(nm);
        }while(true); */

// Check if a number is a prime or not

        int n = sc.nextInt();
        if (n==2){
            System.out.println("It is a prime");
        }
        else{
            boolean isprime = true;
            for (int i=2; i<=n-1; i++){
                if (n%i==0){
                    isprime = false;
                }
            }
            if (isprime==true){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("It is not a prime number");
            }
        }
    }

}


