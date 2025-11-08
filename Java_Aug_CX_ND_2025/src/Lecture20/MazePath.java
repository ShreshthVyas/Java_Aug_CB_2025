package Lecture20;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 3;
		path(1,1,n,m,"");
	}

	public static void path(int cr, int cc, int n, int m, String ans) {
		// TODO Auto-generated method stub
		if(cr == n && cc == m) {
			System.out.println(ans);
			return;
		}
		if(cr > n || cc > m) {
			return;
		}
		path(cr+1, cc, n, m, ans+"V");
		path(cr, cc+1, n, m, ans+"H");
//		path(cr+1, cc+1, n, m, ans+"D");
		
	}

}
