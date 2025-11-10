package Lecture21;

public class KeyPadCombination {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"","abc" ,"def" ,"ghi" ,"jkl" , "mno" ,"pqrs" , "tuv" ,"wx" ,"yz"};
		String s = "12";
		
		rec(s,"",arr);
	}

	public static void rec(String s, String ans, String[] arr) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch =  s.charAt(0);
		int idx =  ch -'0';
		String temp = arr[idx];
		
		for (int i = 0; i < temp.length(); i++) {
			rec(s.substring(1), ans+temp.charAt(i), arr);
		}
	}

}
