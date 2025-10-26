package Lecture19;

public class CoinToss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 4;
		coin(n,"");
		System.out.println();
		cointoss(n, "", false);
	}
	public static void coin(int n, String ans) {
		// TODO Auto-generated method stub
		if(n == 0) {//base case
			System.out.println(ans);
			return;
		}
		if(ans.length() == 0 || ans.charAt(ans.length()-1)!='H') {
			coin(n-1, ans+"H");
		}
		coin(n-1, ans+"T");
	}
	public static void cointoss(int n, String ans,boolean flag) {
		// TODO Auto-generated method stub
		if(n == 0) {//base case
			System.out.println(ans);
			return;
		}
		if(flag ==  false) {
			cointoss(n-1, ans+"H",true);
		}
		cointoss(n-1, ans+"T",false);
	}

}
