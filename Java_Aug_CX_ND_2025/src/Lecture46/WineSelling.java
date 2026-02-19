package Lecture46;

import java.util.Arrays;

public class WineSelling {
//	Given n wines in a row, with integers denoting the cost of each wine respectively. Each year you can sell the first or the last wine in the row. Let the initial profits from the wines be P1, P2, P3…Pn. In the Yth year, the profit from the ith wine will be Y*P[i]. The goal is to calculate the maximum profit that can be earned by selling all the wines.
//	Suppose, wine array denotes the initial cost of each wine in the first year.
//	wine[] = [2, 4, 6, 2, 5]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wine[] = {2,4,6,2,5};
//		int dp[][] = new int[wine.length][wine.length];
//		int ans = rec(wine,0,wine.length-1,1,dp);
		int ans =  WineBU(wine);
		System.out.println(ans);
	}

	private static int rec(int[] wine, int i, int j, int year,int dp[][]) {
		// TODO Auto-generated method stub
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int front = wine[i] * year + rec(wine, i+1, j, year+1,dp);
		int back = wine[j] * year + rec(wine, i, j-1, year+1,dp);
		
		return dp[i][j] = Math.max(front, back);
	}
	
	public static int WineBU( int wine[]) {
		int dp[][] = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {// base caseor last year on i==j diagonal
			dp[i][i] = wine[i]  * year;
		}
		year--;
		
		for (int d = 1; d < dp.length; d++) {
			for (int j = d; j < dp.length; j++) {
				int i = j-d;
				int front = wine[i] * year + dp[i+1][j];
				int back = wine[j] * year + dp[i][j-1];
				dp[i][j] =  Math.max(front, back);
			}
			year--;
		}
		
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		return dp[0][dp[0].length-1];
	}

}
