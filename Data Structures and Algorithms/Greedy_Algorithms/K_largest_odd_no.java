// Question 2 :
// Kth largest odd number in a given range We have two variables L and R,
// indicating a range of integers from L to R inclusive,and a number K,
// the task is to find Kth largest odd number.
// If K>number of odd numbers in the range L to R then return 0.
public class K_largest_odd_no {
    public static int K_largest_odd_no(int[] range, int K){
        // for(int i=-L; i>0; i--){
        //     System.out.print("-"+i+" ");
        // }
        // for(int i=0; i<=R; i++){
        //     System.out.print(i+" ");
        // }
        // return 0;

        if(K <= 0){
            return 0;
        }
        int L = range[0];
        int R = range[1];

        if((R&1) > 0){
            int count = (int) Math.ceil((R-L+1)/2);
            if(K>count){
                return 0;
            }
            else{
                return (R-2*K+2);
            }
        }else{
            int count = (R-L+1)/2;
            if(K>0){
                return 0;
            }else{
                return (R-2*K+1);
            }
        }
    }
    public static void main(String[] args) {
        int range[] = {-3,3};
        int K = 1;
        System.out.println(K_largest_odd_no(range,K));
    }
}
