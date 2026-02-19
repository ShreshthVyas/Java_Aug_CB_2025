package Lecture46;

import java.util.Arrays;

public class MinimumFallingPathSum {

	public int minFallingPathSum(int[][] matrix) {
		int dp[][] = new int[matrix.length][matrix.length];
		for (int[] is : dp) {
			Arrays.fill(is, -100001);
		}
		int min  = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			int ans = rec(matrix, 0,i,dp);
			min = Math.min(ans, min);
		}
		return min;
	}

	private int rec(int[][] matrix, int cr, int cc, int dp[][]) {
		// TODO Auto-generated method stub
		if(cc>=matrix[0].length || cc<0) {
			return Integer.MAX_VALUE;
		}
		if(cr == matrix.length-1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!= -100001) {
			return dp[cr][cc];
		}
		int lb =  rec(matrix, cr+1, cc-1,dp);
		int b =  rec(matrix, cr+1, cc,dp);
		int rb =  rec(matrix, cr+1, cc+1,dp);
		return dp[cr][cc]=  matrix[cr][cc] + Math.min(b, Math.min(lb, rb));
	}
}
