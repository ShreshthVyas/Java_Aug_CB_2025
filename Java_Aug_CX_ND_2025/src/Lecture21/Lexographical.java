package Lecture21;

public class Lexographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		lex(n,0);
	}

	private static void lex(int n, int ans) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		int i = 0;
		if(ans == 0) {
			i =1;
		}
		for (; i <=9; i++) {
			lex(n, ans*10 + i);
		}
		
	}

}
