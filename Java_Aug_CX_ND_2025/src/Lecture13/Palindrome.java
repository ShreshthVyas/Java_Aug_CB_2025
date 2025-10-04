package Lecture13;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123naman32";
		boolean ans =  palindrome(s);
		System.out.println(ans);
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
