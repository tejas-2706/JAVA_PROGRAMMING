import java.util.Scanner;

public class patterns_advance {
    
    public static void Hollow_Rectangle(int totRows,int totColumns){
        // outer loop for Rows
        for (int i=1; i<=totRows; i++){
            // Inner loop for Columns
            for (int j=1; j<=totColumns; j++){
                if (i==1 || i==totRows || j==1 || j==totColumns){
                    // Boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Inv_Rot_H_Pyramid(int n){
        // Outer loop
        for (int i=1; i<=n; i++){
            // Spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inv_Half_Pyramid_Num(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }

    public static void Floyd_Triangle(int n){
        int counter = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        // 1 st Half
        for (int i=1; i<=n; i++){
            // stars i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces -formula 2*(n-i)
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 nd Half
        for (int i=n; i>=1; i--){
             // stars i
             for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces -formula 2*(n-i)
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Solid_Rhombus(int n){
        // outer loop 
        for (int i=1; i<=n; i++){
            // spaces- n-i
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars n
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n){
        for (int i=1; i<=n; i++){
            // spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond_Pattern(int n){
        // 1 st Half (1 to n) 
        for (int i=1; i<=n; i++){
            // inner loop - spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars 
            for (int j=1; j<=(2*(i) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  2 nd Half (n to i)  
        for (int i=n; i>=1; i--){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars 
            for (int j=1; j<=(2*(i) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Number_Pyramid(int n){
        // outer loop
        for (int i=1; i<=n; i++){
            // inner loop- spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // numbers
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    
    }

    public static void Palindrome_Patt_num(int n){
        // outer loop- lines
        for (int i=1; i<=n; i++){
            // inner loop- spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Descending order loop
            for (int j=i; j>=2; j--){
                System.out.print(j);
            }
            // Ascending order loop
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter total no. of Rows:-");
        // int totRows = sc.nextInt();
        // System.out.println("Enter total no. of Columns:-");
        // int totColumns = sc.nextInt();
        // Hollow_Rectangle(totRows,totColumns);

        // Inv_Rot_H_Pyramid(4);

        // Inv_Half_Pyramid_Num(5);

        // Floyd_Triangle(5);

        // zero_one_triangle(5);

        // Butterfly(5);
        
        // Solid_Rhombus(50);

        // Hollow_Rhombus(3);

        // Diamond_Pattern(20);

        // Number_Pyramid(5);

        Palindrome_Patt_num(5);
    }
}
