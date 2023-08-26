import java.util.*;
public class Min_abs_diff {
    public static void Minimum_Absolute_Difference_Pairs(int A[], int B[]){//O(nlogn)
        Arrays.sort(A);
        Arrays.sort(B);
        int MinDiff = 0;
        for(int i=0; i<A.length; i++){
            MinDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum Absolute Difference is = " + MinDiff);
    }

    // MAXIMUM LENGTH CHAIN OF PAIRS

    public static void max_len_chain_pairs(int Pairs[][]){ //O(nlogn)
        // sort
        Arrays.sort(Pairs,Comparator.comparingDouble(o -> o[1]));
        int n = Pairs.length;
        int ans = 0;
        int LastEnded = Pairs[0][1];
        ans = 1;
        for(int i=1; i<n; i++){
            if(Pairs[i][0] > LastEnded){
                ans++;
                LastEnded = Pairs[i][1];
            }
        }
        System.out.println(" MAXIMUM LENGTH OF CHAIN = " + ans);
    }
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        // Minimum_Absolute_Difference_Pairs(A,B);

        int Pairs[][] = {{5,24},
                        {39,60},
                        {5,28},
                        {27,40},
                        {50,90}};

        max_len_chain_pairs(Pairs);
    }
}
