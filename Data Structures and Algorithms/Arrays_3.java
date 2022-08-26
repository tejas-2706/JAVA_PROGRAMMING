import javax.swing.plaf.synth.SynthPasswordFieldUI;
import java.io.*;

public class Arrays_3 {

    // BINARY SEARCH 
    public static int Binary_Search(int numbers[], int key){
        int start = 0; int end = numbers.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] < key){ // right 
                start = mid+1;
            }
            else { // left
                end = mid-1;
            }
        }
        return -1;
    }

    // REVERSE
    public static int Reverse(int numbers[]){
        int first = 0; int last = numbers.length-1;
        // swap
        while (first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        return -1;
    }

    // PRINT PAIRS OF ARRAY
    public static void Print_Pairs(int numbers[]){
        int tp = 0;
        for (int i=0; i<numbers.length-1; i++){
            int curr = numbers[i];
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }

    // PRINT SUB-ARRAYS
    public static void SubArrays(int numbers[]){
        int ts = 0;
        for (int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end =j;
                for (int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    ts = numbers[k]*(numbers[k]-1)/2;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sum = " + ts);
    }

    // MAX. SUB-ARRAY SUM
    public static void MaxSubArraysSum_BruteForce(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++){
            // int start = i;
            for (int j=i; j<numbers.length; j++){
                // int end = j;
                currSum = 0;
                for (int k=i; k<=j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max. Sum = " + maxSum);
   }

   public static void MaxSubArraysSum_PrefixSum(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];
    // calculate prefix array
    for (int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + numbers[i];
    }
    for (int i=0; i<numbers.length; i++){
        int start = i;
        for (int j=i; j<numbers.length; j++){
            int end = j;
            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            
            // System.out.println(currSum);
            if (maxSum < currSum){
                maxSum = currSum;
            }
        }
    }
    System.out.println("Max. Sum = " + maxSum);
}

    public static void MaxSubArraysSum_KadanesAlgorithm(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // int newmaxSum = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            currSum += numbers[i];
            if (currSum<0){
                currSum = 0;
            }
            if (maxSum < currSum){
                maxSum = currSum;
                // if (maxSum == 0){
                //     for (int j=0; j<numbers.length; j++){
                //         if (maxSum < numbers[j]){
                //             maxSum = numbers[j];
                //         }
                //     }
                // }
            }
            
        }
        System.out.println("Max. Sum = " + maxSum +";");
    }
    public static void main(String[] args) {
        // int numbers[] = {2,4,6,8,10};
        // int numbers[] = {1,-2,6,-1,3};
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // int numbers[] = {-1,-2,-6};
        // int key = 10;
        // System.out.println("Key is at index : "+ Binary_Search(numbers, key));
        
        // Reverse(numbers);
        // for (int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }

        // Print_Pairs(numbers);

        // SubArrays(numbers);

        // MaxSubArraysSum_BruteForce(numbers);

        // MaxSubArraysSum_PrefixSum(numbers);

        MaxSubArraysSum_KadanesAlgorithm(numbers);
    }
}

