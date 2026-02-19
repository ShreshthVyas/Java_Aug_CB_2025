package Lecture46;

public class EditDistanceBU {

	public int minDistance(String s, String t) {
		int dp[][] = new int[s.length()+1][t.length()+1];
		
		for (int i = 1; i < dp[0].length; i++) {
			dp[0][i] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = i;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}
				else {
					int I= dp[i][j-1];
					int R= dp[i-1][j-1];
					int D=  dp[i-1][j];
					dp[i][j] = 1+ Math.min(I, Math.min(R, D));
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}
