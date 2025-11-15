package Lecture22;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int q = 2;
		boolean board[] =  new boolean[n];
		rec(board,0,q,"");
	}

	public static void rec(boolean[] board, int qpsf, int noq, String ans) {
		// TODO Auto-generated method stub
		if(qpsf == noq) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < board.length; i++) {
			if(board[i] == false) {
				board[i] = true;// queen placed
				rec(board, qpsf+1, noq, ans+"b" + i + "q" + qpsf);
				board[i] = false;// backtracking
			}
		}
	}

}
