import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[value.length][2];

        for(int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        // sort in ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int Capacity = W;
        int finalValue = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(Capacity >= weight[idx]){
                finalValue += value[idx];
                Capacity -= weight[idx];
            }else{
                finalValue += (ratio[i][1] * Capacity);
                Capacity = 0;
                break;
            }
        }
        System.out.println("Final value = "+ finalValue);
    }
}
