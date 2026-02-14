package Lecture45;

public class EditDistances {

	public int minDistance(String s, String t) {
		Integer dp[][] = new Integer[s.length()][t.length()];
		return rec(s,t,0,0,dp);
	}

	private int rec(String s, String t, int i, int j, Integer dp[][]) {
		// TODO Auto-generated method stub
		if(i== s.length()) {
			return t.length() - j;// remaining characters in t
		}
		if(j== t.length()) {
			return s.length() - i;// remaining characters in s
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		if(s.charAt(i) == t.charAt(j)) {
			return dp[i][j] = rec(s, t, i+1, j+1,dp);
		}
		else {
			int I=  rec(s, t, i, j+1,dp);
			int R=  rec(s, t, i+1, j+1,dp);
			int D=  rec(s, t, i+1, j,dp);
			return dp[i][j] = 1+ Math.min(I, Math.min(R, D));
		}
		
	}
	

}
