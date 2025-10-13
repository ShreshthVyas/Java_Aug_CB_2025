package Lecture16;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "hello";
		String ans = reverse(s);
		System.out.println(ans);
	}

	public static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

}
