package Lecture47;

public class PrintAllSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "abcd";
		
		int n =  s.length();
		
		for (int i = 0; i < (1<<n); i++) {
			subseq(i,s);
		}
	}

	private static void subseq(int i, String s) {
		// TODO Auto-generated method stub
		int pos = 0;
		while(i>0) {
			if((i&1) == 1) {
				System.out.print(s.charAt(pos));
			}
			i = i>>1;
			pos++;
		}
		System.out.println();
	}

}
