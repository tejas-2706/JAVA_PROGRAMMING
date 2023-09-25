package Dynamic_Programming_DP;

public class Longest_Common_Subsequence {
	public static int RecursiveLCS(String str1, String str2, int n, int m) {
		if(n==0 || m==0) {
			return 0;
		}
		if(str1.charAt(n-1) == str2.charAt(m-1)) { // same
			return RecursiveLCS(str1, str2, n-1, m-1) + 1;
		}else { // different
			int ans1 = RecursiveLCS(str1, str2, n-1, m);
			int ans2 = RecursiveLCS(str1, str2, n, m-1);
			return Math.max(ans1, ans2);
		}
	}
	
//	O(n*m)
	public static int MemoizationLCS(String str1, String str2, int n, int m, int dp[][]) {
		if(n==0 || m==0) {
			return 0;
		}
		if(dp[n][m] != -1) {
			return dp[n][m];
		}
		
		if(str1.charAt(n-1) == str2.charAt(m-1)) { // same
			return dp[n][m] = MemoizationLCS(str1, str2, n-1, m-1,dp) + 1;
		}else { // different
			int ans1 = MemoizationLCS(str1, str2, n-1, m,dp);
			int ans2 = MemoizationLCS(str1, str2, n, m-1,dp);
			return dp[n][m] = Math.max(ans1, ans2);
		}
	}
	
	public static int TabulationLCS(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int dp[][] = new int[n+1][m+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<m+1; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
			}
		}
		if(n==0 || m==0) {
			return 0;
		}
		System.out.print("LCS is = ");
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					System.out.print(str1.charAt(i-1)+"");
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					int ans1 = dp[i-1][j];
					int ans2 = dp[i][j-1];
					dp[i][j] = Math.max(ans1, ans2);
				}
			}
		}
		System.out.println("");
		return dp[n][m];
	}
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "ace";
		int n = str1.length();
		int m = str2.length();
		System.out.println("LCS BY RECURSION = " + RecursiveLCS(str1, str2, n, m));
	    
		int dp[][] = new int[n+1][m+1];
//		initialization with -1
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<m+1; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println("LCS BY MEMOIZATION = " + MemoizationLCS(str1, str2, n, m,dp));
	
		System.out.println("LCS BY TABULATION = " + TabulationLCS(str1, str2));

	}
}
