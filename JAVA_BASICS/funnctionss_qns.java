import javax.sql.rowset.spi.SyncResolver;

public class funnctionss_qns {

// Question 1 :
// Write a Java method to compute the averageof three numbers..
    public static void avg_3(int num1,int num2,int num3){
        int average = (num1+num2+num3)/3;
        System.out.println(average);
    }

// Question2:
// Write a method named isEven that accepts an int argument.
// The method should return true if the argument iseven, or false otherwise. Also write aprogram to test your method.
    public static void isEven(int n){
        if (n%2==0){
            boolean bl = true;
            System.out.println("Nummber is Even i.e "+bl);
        }
        else{
            boolean bl = false;
            System.out.println("Nummber is Odd i.e "+bl);
        }
    }

// Question3:
// Write a Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a numbere.g.,121isapalindromebecausethereverseof121is121itself.
// Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321.
    public static void ispalindrome(){





    }

    // Question 5 :
    // Write a Java method to compute the sum of the digits in an integer.
    // (Hint: Approach this question in the following way:
    // a.Take a variable sum = 0
    // b.Find the last digit of the number
    // c.Add it to the sumd.
    // Repeat a & b until the number becomes 0 )
    public static void int_sum(){
        
    }

    public static void main(String args[]){
        // avg_3(2,3,4 );
        
        // isEven(5);
    }
}
