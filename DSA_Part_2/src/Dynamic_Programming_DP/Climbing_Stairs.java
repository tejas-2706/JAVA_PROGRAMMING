package Dynamic_Programming_DP;

import java.util.*;

public class Climbing_Stairs {
	public static int CountWays(int n) {//recursion // T.C = O(2^n)
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		return CountWays(n-1)+CountWays(n-2);
	}
	
	public static int CountWaysMemonization(int n,int ways[]) {//Memonization DP T.C = O(n)
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}if(ways[n]!=-1) {
			return ways[n];
		}
		ways[n] = CountWaysMemonization(n-1, ways)+CountWaysMemonization(n-2, ways);
	    return ways[n];
	}
	
	public static int CountWaysTabulation(int n) {//Tabulation DP T.C = O(n)
	    int dp[] = new int[n+1];//0 to n not n-1
	    dp[0] = 1;
	    
	    for(int i=1; i<=n; i++) {
	    	if(i==1) {
	    		dp[i] = dp[i-1]+0;
	    	}
	    	else {
	    	    dp[i] = dp[i-1] + dp[i-2];
	    	}
	    }
	    return dp[n];

	}
	public static void main(String[] args) {
		int n = 5;
		int ways[] = new int[n+1];//0 to n
		Arrays.fill(ways, -1);
		System.out.println("Using Recursion = "+CountWays(n));
		System.out.println("Memonization = "+CountWaysMemonization(n, ways));
		System.out.println("Tabulation = "+CountWaysTabulation(n));
	}
}
