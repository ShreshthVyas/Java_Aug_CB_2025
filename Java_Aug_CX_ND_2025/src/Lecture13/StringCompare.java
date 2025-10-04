package Lecture13;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "hello";
		String s1 =  new String("ello");
		
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(5));
		System.out.println(s1.equals(s2));
		System.out.println(s2.compareTo(s1));
		boolean ans =  equals(s1,s2);
		System.out.println(ans);
	}

	public static boolean equals(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
