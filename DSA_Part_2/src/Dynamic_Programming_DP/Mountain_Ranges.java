package Dynamic_Programming_DP;

public class Mountain_Ranges {
//	O(n*n)
	public static int MountainRanges(int n) {
		int dp[] = new int[n+1];
		dp[0] = dp[1] = 1;
		for(int i=2; i<=n; i++) {
			for(int j=0; j<i; j++) {
				int inside = dp[j];
				int outside = dp[i-j-1];
				dp[i] += inside * outside; 
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.print(MountainRanges(n));
	}
}
