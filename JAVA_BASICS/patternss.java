public class patternss {
    public static void main(String args[]){
        for(int lines=1;lines<=4;lines++){
            for (int stars=1;stars<=lines;stars++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for(int i=4;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        // Inverted half triangle
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4-i+1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // int n = 17;
        // // 2 nd Half
        // for (int i=n; i>=1; i--){
        //      // stars i
        //      for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // spaces -formula 2*(n-i)
        //     for (int j=1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     // stars i
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i=1; i<=n; i++){
        //     // stars i
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // spaces -formula 2*(n-i)
        //     for (int j=1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     // stars i
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
