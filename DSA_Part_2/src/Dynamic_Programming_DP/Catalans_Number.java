package Dynamic_Programming_DP;

import java.util.Arrays;

public class Catalans_Number {
	public static int catalanRec(int n) {
		int ans = 0;
		if(n==0 || n==1) {
			return 1;
		}
		for(int i=0; i<=n-1; i++) {
			ans += catalanRec(i)*catalanRec(n-i-1);
		}
		return ans;
	}
	public static int catalanMem(int n,int dp[]) {
		if(n==0 || n==1) {
			return 1;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		int ans = 0;
		for(int i=0; i<=n-1; i++) {
			ans += catalanMem(i,dp)*catalanMem(n-i-1,dp);
		}
		return dp[n] = ans;
	}
//	O(n*n)
	public static int catalanTab(int n) {
		int dp[] = new int[n+1];
		dp[0] = dp[1] = 1;
		for(int i=2; i<=n; i++) {
			for(int j=0; j<i; j++) {
				dp[i] += dp[j] * dp[i-j-1]; 
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		int n = 5;
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);
//		System.out.print(catalanRec(n));
		System.out.println(catalanMem(n, dp));
		
		System.out.println(catalanTab(n));
	}
}
