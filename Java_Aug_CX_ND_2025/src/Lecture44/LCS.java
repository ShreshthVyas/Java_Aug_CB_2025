package Lecture44;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestCommonSubsequence(String s, String t) {
		int ans = rec(s,t,0,0);
		return ans;
	}

	private int rec(String s, String t, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=s.length() || j>= t.length()) {
			return 0;
		}
		
		if(s.charAt(i) ==  t.charAt(j)) {
			return 1 + rec(s, t, i+1, j+1);
		}
		else {
			int skipS = rec(s, t, i+1, j);
			int skipT = rec(s, t, i, j+1);
			return Math.max(skipS, skipT);
		}
		
	}

}
