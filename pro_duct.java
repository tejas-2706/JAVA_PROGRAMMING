// import java.util.Scanner;
// public class pro_duct{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int mul = a*b;
//         System.out.println("Product is " + mul); 
//     }
// }

import java.util.Scanner;
public class pro_duct{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int pi = sc.nextInt();
        float r = sc.nextFloat();
        // double Area = 3.14*r*r;
        float Area = 3.14f*r*r;
        System.out.println(Area);
        sc.close(); 
        }
}