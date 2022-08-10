import java.util.Scanner;

public class iff_elsee_qns {
    public static void main(String args[]){
        // Question1:
        // Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        if (n>=0){
            System.out.println("It is an Positive number");
        }
        else{
            System.out.println("It is an Negative number");
        }
        {
        // Question2:
        // Finish the following code so that it prints You have a fever if,
        // your temperature is above 100 and otherwise prints You don't have a fever.
        
            double temp = 103.5;
            if (temp>100){
                System.out.println("You Have a Fever!!");
            }
            else{
                System.out.println("You Don't Have a Fever!!");
            }
        }
        {
        // Question3:
        // Write a Java program to input week number(1-7)and print day of week name using switch case.
            int week_number =  sc.nextInt();
            switch (week_number){
                case 1 : System.out.println("Monday");
                break;
                case 2 : System.out.println("Tuesday");
                break;
                case 3 : System.out.println("Wednesday");
                break;
                case 4 : System.out.println("Thursday");
                break;
                case 5 : System.out.println("Friday");
                break;
                case 6 : System.out.println("Saturday");
                break;
                case 7 : System.out.println("Sunday");
                break;
                default : System.out.println("Wrong Input !!");
            }
        }
        {
        //Question 4 :
        // What will be the value of x & y in the following program:
            int a=63,b=36;
            boolean x= (a<b)? true:false;
            int y= (a>b)? a:b;
            System.out.println(x);
            System.out.println(y);
        }
        {
        // Question5:
        // Write a Java program that takes a year from the user and print whether that year is a leap year or not.
            int year = sc.nextInt();
            if (year > 1000 && year < 10000){
                if(year%4==0 && year%400==0){
                    System.out.println("It is an Leap year ");
                }
                else{
                    System.out.println("It is not an leap year");
                }
            }
            else{
                System.out.println("Input an Valid 4 number Year");
            }
            }
        }

    }

}
