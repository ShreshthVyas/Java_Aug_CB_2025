package Lecture20;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		rec(s,"");
	}

	public static void rec(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char ch =  s.charAt(i);
			String left =  s.substring(0,i);
			String right =  s.substring(i+1);
			rec(left+right, ans+ch);
		}
	}

}
