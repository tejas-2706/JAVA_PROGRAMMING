package Dynamic_Programming_DP;

public class Unbounded_Knapsack {
	public static int UnboundedKnapsackTabulation(int val[],int wt[],int W) {
		int n=val.length;
		int dp[][] = new int[n+1][W+1];
		for(int i=0; i<dp.length; i++) { // coloumn
			dp[i][0] = 0;
		}
		for(int j=0; j<dp[0].length; j++) { // 0th row
			dp[0][j] = 0;
		}
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				
//				ONE CHANGE VAL[i] in incProfit
				
				int v = val[i-1];// i th item val
				int w = wt[i-1];// i th item wt
				if(w<=j) { // valid
					int incProfit = v + dp[i][j-w];
					int excProfit = dp[i-1][j];
					dp[i][j] = Math.max(incProfit, excProfit);
				}else {
					int excProfit = dp[i-1][j];
					dp[i][j] = excProfit;
				}
			}
		}
//		Print(dp);
		return dp[n][W];
	}
	public static void Print(int dp[][]) {
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int val[] = {15,14,10,45,30};
		int wt[] = {2,5,1,3,4};
		int W = 7;
		
		System.out.println(UnboundedKnapsackTabulation(val, wt, W));
	}
}
