package Lecture22;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		part(s,"");
		
	}

	public static void part(String s,String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 1; i <= s.length(); i++) {
			String temp = s.substring(0,i);
			if(ispal(temp)) {
				part(s.substring(i), ans+ temp + "|");
			}
		}
	}
	
	public static boolean ispal(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
