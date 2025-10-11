package Lecture15;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "aabbccgfhdbbcccheidaanbb";
		
		String temp = "abcdefghijklmnopqrstuvxyz";
		for (int i = 0; i < temp.length(); i++) {
			char ch =  temp.charAt(i);
			int count =0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) ==  ch) {
					count++;
				}
			}
			if(count != 0) {
				System.out.println(ch + " " + count);
			}
			
		}
	}

}
