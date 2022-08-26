import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class loops_qns {
    public static void main(String args[]){
/*Question2:
Write a program that reads a set of integers,and then prints the sum of the even and odd integers.*/
    Scanner sc = new Scanner(System.in);
    int n; int choice; int even = 0; int odd = 0;
    while (true) {
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (n%2==0){
            even += n;
        } 
        else{
            odd += n;
        }
    }
    System.out.println(even);
    System.out.println(odd);


    }
}
