package Lecture20;

public class TrickyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cabac";
		rec(s,"");
		
	}

	public static void rec(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean vis[] =  new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch =  s.charAt(i);
			int idx = ch-'a';
			if(vis[idx] == false) {
				vis[idx] = true;
				String left =  s.substring(0,i);
				String right =  s.substring(i+1);
				rec(left+right, ans+ch);
			}
			
		}
	}
	

}
