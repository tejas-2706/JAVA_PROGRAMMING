import java.util.Scanner;

public class Arrayss{
    public static void main(String args[]){
        // Creating an Array
        int marks[] = new int[50];
        
        // int numbers[] = {1,2,3};

        // String food[] = {"Rice", "Chappatai", "Sabji"}; 

        System.out.println("Length of array = " + marks.length);
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy = "+ marks[0]);
        System.out.println("chem = "+ marks[1]);
        System.out.println("maths = "+ marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+percentage + "%");
    }
}
