package Lecture45;

import java.util.Arrays;

public class DistinctSubsequences {

	 public int numDistinct(String s, String t) {
	       int dp[][] = new int[s.length() + 1][t.length() + 1];
			for (int[] is : dp) {
				Arrays.fill(is, -1);
			}
			return rec(s,t,0,0,dp);
		}
	    // s---> coin
	    //t---> amount
		private int rec(String s, String t, int i, int j,int dp[][]) {
			// TODO Auto-generated method stub
			if (j == t.length()) {
				return 1; // One Subsequence found
			}
			if(i == s.length()) {
				return 0;
			}
			if(dp[i][j]!=-1) {
				return dp[i][j];
			}
			int inc =0;int exc =0;
			 
			if(s.charAt(i) == t.charAt(j)) {
				inc+= rec(s, t, i+1, j+1,dp);
			}
			exc+= rec(s, t, i+1, j,dp);
			
			return dp[i][j] = inc + exc;
	    }

}
