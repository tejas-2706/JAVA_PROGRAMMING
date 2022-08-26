import java.util.Scanner;

public class iff_elsee {
    public static void main(String args[]) {
    //     int num1 = 5;
    //     int num2 = 1;
    //     if (num1>=num2){
    //         System.out.println("Num 1 is greater than Num 2");
    //     }
    //     else {
    //         System.out.println("Num 2 is greater than Num 1");
    //     }   
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     if (n%2==0){
    //         System.out.println("It is an EVEN Number!!");
    //     } 
    //     else{
    //         System.out.println("It is an ODD Number!!");  
    //     }
    // }
    // {
    //     Scanner s = new Scanner(System.in);
    //     int income = s.nextInt();
    //     int Tax;
    //     if (income < 500000){
    //         Tax = 0;
    //     }
    //     else if (income >= 500000 && income < 1000000){
    //         Tax = (int) (income*0.2);
    //     }
    //     else {
    //         Tax = (int) (income*0.3);
    //     }

    //     System.out.println("Your Tax on income i.e. Rs." + Tax);

    // }
    // {
    //     int a = 3, b = 3, c = 3;
    //     if (a>=b && a>=c){
    //         System.out.println("A is Greater amongst all!!");
    //     }
    //     else if (b>=c){
    //         System.out.println("B is Greater amongst all!!");
    //     }
    //     else {
    //         System.out.println("C is Greater amongst all!!");

    //     }
    // }
    // {
    //     // ternary operator
    //     // variable = condition? statement 1 : statement 2
    //     int num = 9;
    //     String type = (num%2==0) ? "even" : "odd";
    //     System.out.println(type); 
    // }
    // {
    //     int marks = 33;
    //     String result = (marks>=33) ? "Pass" : "Fail";
    //     System.out.println(result);
    // }
    // {
    //     int n = 2;
    //     switch (n){
    //         case 1 : System.out.println("Idli");
    //         break;
    //         case 2 : System.out.println("Dosa");
    //         break;
    //         case 3 : System.out.println("Milk shake");
    //         break;
    //         default : System.out.println("wake up...");

    //     }
    // }
    {
        Scanner se = new Scanner(System.in);
        int num1 = se.nextInt();
        int num2 = se.nextInt();
        System.out.println("Enter above numbers to perform the specific operations:");
        System.out.println(" 1: Addition \n 2: Substraction \n 3: Multiplication \n 4: Division \n");
        int operator = se.nextInt();
        switch(operator){
            case 1 : System.out.println("Addition of two numbwers is: " + (num1+num2));
            break;
            case 2 : System.out.println("Substraction of two numbwers is: " + (num1-num2));
            break;
            case 3 : System.out.println("Multiplication of two numbwers is: " + (num1*num2));
            break;
            case 4 : System.out.println("Division of two numbwers is: " + (num1/num2));
            break;
            default : System.out.println("Only Mention Operations can be Performed by this Calculator!!");


        }


    }

    }
}
