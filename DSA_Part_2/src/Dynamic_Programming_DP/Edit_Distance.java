package Dynamic_Programming_DP;

public class Edit_Distance {
	public static int editDistance(String str1,String str2) {
		int n = str1.length();
		int m = str2.length();
		int dp[][] = new int[n+1][m+1];
		
//		initialization
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<m+1; j++) {
				if(i==0) {
					dp[i][j] = j;
				}
				if(j==0) {
					dp[i][j] = i;
				}
			}
		}
//		bootom up
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
//				same
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {//different
					int add = dp[i][j-1]+1;
					int del = dp[i-1][j]+1;
					int rep = dp[i-1][j-1]+1;
					dp[i][j] = Math.min(add,Math.min(del, rep));
				}
			}
		}
		return dp[n][m];
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
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					int ans1 = dp[i-1][j];
					int ans2 = dp[i][j-1];
					dp[i][j] = Math.max(ans1, ans2);
				}
			}
		}
		return dp[n][m];
	}
	public static int StringConversion(String str1,String str2) {
		int n = str1.length();
		int m = str2.length();

		int lcs = TabulationLCS(str1, str2);
		int ans = 0;
		if(n != lcs) {
			ans = ans + (n-lcs);
		}
		if(m != lcs) {
			ans = ans + (m-lcs);
		}
		return ans;
	}
	public static void main(String[] args) {
//		String word1 = "intention";
//		String word2 = "execution";
		String word1 = "pear";
		String word2 = "sea";

		System.out.println(editDistance(word1, word2));
		System.out.print(StringConversion(word1,word2));
	}
}
