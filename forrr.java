public class forrr {
    public static void main(String[] args) {
        // for (int i=1;i<=10;i++){
        //     System.out.println("Hello World");
        // }
        // for (int lines=1; lines<=4; lines++){
        //     System.out.println("* * * *");
        // }
        // int n = 20378;
        // while (n>0){
        //     int last_digit = n%10;
        //     System.out.print(last_digit);
        //     n = n/10;
        // }
        int num = 21121;
        int rev = 0;
        while (num>0){
            int LD = num%10;
            rev = (rev*10) + LD;
            num= num/10;
        }
        System.out.print("reverse is: " + rev);
    }
        
    
    
}
