import java.util.*;
public class oops_qns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        Complex c = new Complex();
        System.out.println(c.sum(num1,num2));
        System.out.println( c.product(num1, num2));
        System.out.println(c.difference(num1, num2));
    }    
}
/*
 * Question1:
 * Print the sum,difference and product of two complex numbers by creating a class named'Complex' with separate methods for 
 * each operation whose real and imaginary parts are entered by the user.
 */
class Complex{

    float sum(float num1, float num2){
        return num1+num2;
    }
    float product(float num1, float num2){
        return num1*num2;
    }
    float difference(float num1, float num2){
        return num1/num2;
    } 
}