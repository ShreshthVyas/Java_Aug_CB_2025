package Lecture15;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "aabb";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String substr = s.substring(i,j);
				boolean ans = palindrome(substr);
				if(ans ==  true) {
					System.out.println(substr);
				}
			}
		}
	}
	public static boolean palindrome(String s) {
		// TODO Auto-generated method stub
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
