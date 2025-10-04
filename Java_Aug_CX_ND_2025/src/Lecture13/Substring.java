package Lecture13;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "abcd";
//		System.out.println(s.substring(1,2));
//		System.out.println(s.substring(1));
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
		
	} 

}
