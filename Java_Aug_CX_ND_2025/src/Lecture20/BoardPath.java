package Lecture20;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 5;
		board(n,0,"",m);
	}

	public static void board(int n, int tot, String ans,int m) {
		// TODO Auto-generated method stub
		if(tot == n) {
			System.out.println(ans);
			return;
		}
		if(tot>n) {
			return;
		}
		for (int i = 1; i <=m ; i++) {
			board(n, tot+i, ans+i,m);
		}
	}
//	public static void board(int n, int tot, String ans) {
//		// TODO Auto-generated method stub
//		if(tot == n) {
//			System.out.println(ans);
//			return;
//		}
//		if(tot>n) {
//			return;
//		}
//		board(n, tot+1, ans+1);
//		board(n, tot+2, ans+2);
//		board(n, tot+3, ans+3);
//		
//	}

}
