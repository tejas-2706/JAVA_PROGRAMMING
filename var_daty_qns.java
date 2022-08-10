/*Question1:  
In a program,input3numbers:A,B and C.You have to output the average of these 3 numbers*/
import java.util.Scanner;
public class var_daty_qns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float Average = (A+B+C)/3;
        System.out.println("The Average is " + Average);

/*Question2:
In a program, input the side of a square.
You have to output the area of the square*/
        System.out.println("Area of the Square Calculator:-");
        System.out.println("Input the side:- ");
        float side = sc.nextFloat();
        float Area = side*side;
        System.out.println(Area);

/*Question3:
Enter cost of 3-items from the user(using float data type)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill. */
        System.out.println("Total cost of the item calculator:- ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        float $gst= 0.18f*total;
        float total_cost = total+$gst;
        System.out.println("The Total cost of items including GST is:-  " + total_cost);
        
    }
}
