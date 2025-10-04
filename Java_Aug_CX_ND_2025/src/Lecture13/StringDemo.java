package Lecture13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "hello";
		String t = new String("hello");
		String s1 =  "hello";
		String g = new String("hello");
		
		System.out.println(s==s1);
		System.out.println(s==t);
		System.out.println(g==t);
		
	}

}
