import java.util.Scanner;
public class Input_in{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        // String input = s.nextLine();
        // System.out.println(input);
        // int a = s.nextInt();
        // System.out.println(a);
        // float f = s.nextFloat();
        // System.out.println(f);
        // boolean bl = s.nextBoolean();
        // System.out.println(bl);
        // double db = s.nextDouble();
        // System.out.println(db);
        // Byte bt = s.nextByte();
        // System.out.println(bt);
        // Long lg = s.nextLong();
        // System.out.println(lg);
        // Short sh = s.nextShort();
        // System.out.println(sh);
        // s.close();


/* Type conversion--------------------------
 byte->short->int->float->long->double
 from small to big bytes conversion are possible not opposite
*/
        //int a = 34;
        //long b = a;
        // System.out.println(b);
        //float c = s.nextInt();
        // System.out.println(c);



/*
Type casting
 * float can be converted oppoite by some loosing of data
 */
        float no = 99.99f;
        int i = (int) no;
        System.out.println(i);


/*
 * character value stored in integer
 */
        char ch = 'z';
        int number = ch;
        System.out.println(number);
        
/*
 * Type promotion in expression
 * 
 * Java promotes byte,short,or char to int;
 * Java promotes long,float,or double to long,float,double;

 * 
 */
    byte o = 5;
    o = (byte) (o*2);
    System.out.println(o);


    short sh = 2;
    byte b = 3;
    char c = 'a';
    byte bt = (byte) (sh+b+c);
    System.out.println(bt);


    } 
}