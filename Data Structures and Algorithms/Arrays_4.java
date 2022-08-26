public class Arrays_4 {
    public static int Trapped_Rainwater(int height[]){
        int n = height.length;
        // claculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for (int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    // BUY-SELL STOCK
    public static int buy_sell_stock(int price[]){
        int Buy_Price = Integer.MAX_VALUE;
        int Max_Profit = 0;
        for (int i=0; i<price.length; i++){
            if (Buy_Price < price[i]){
                int Profit = price[i] - Buy_Price;
                if (Profit > Max_Profit){
                    Max_Profit = Profit;
                }
            }
            else {
                Buy_Price = price[i];
            }
        }
        return Max_Profit;

    }
    public static void main(String args[]){
        // int height[] = {4,2,0,6,3,2,5}; // o(n)
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(Trapped_Rainwater(height));

        int price[] = {7,1,5,3,6,4}; // o(n)
        // System.out.println(buy_sell_stock(price));
    }
}
