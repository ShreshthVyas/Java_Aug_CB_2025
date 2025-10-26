package Lecture19;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 4;
		coin(n,"");
	}

	public static void coin(int n, String ans) {
		// TODO Auto-generated method stub
		if(n == 0) {//base case
			System.out.println(ans);
			return;
		}
		coin(n-1, ans+"H");
		coin(n-1, ans+"T");
	}

}
