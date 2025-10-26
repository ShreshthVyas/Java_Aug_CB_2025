package Lecture19;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		rec(n,n,"");
	}

	public static void rec(int op, int cl, String ans) {
		// TODO Auto-generated method stub
		if(op == 0 && cl == 0) {
			System.out.println(ans);
			return;
		}
		if(op>0) {
			rec(op-1, cl, ans+"(");
		}
		if(op<cl) {
			rec(op, cl-1, ans+")");
		}
		
	}

}
