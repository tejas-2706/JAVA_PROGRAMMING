import java.util.Scanner;

public class whilee {
    public static void main(String args[]){
    //     int counter = 1;
    //     while(counter<=10){
    //         System.out.print(counter+" ");
    //         counter++;
    //     }
    // }
        Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while (counter<=n){
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        int n  =sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
