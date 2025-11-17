package Lecture23;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		boolean [][] board =  new boolean[n][n];
		
		rec(board,0,0,n);
	}

	public static void rec(boolean[][] board, int qpsf, int row, int n) {
		// TODO Auto-generated method stub
		if(qpsf == n) {
			Display(board);
			return;
		}
		if(row ==n) {
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(isItPossible(board,row,col)) {
				board[row][col] = true;//Queen placed
				rec(board, qpsf+1, row+1, n);
				board[row][col] = false;
			}
		}
	}

	public static boolean isItPossible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//Up
		for (int r = row; r>=0; r--) {
			if(board[r][col]) {
				return false;
			}
		}
		
		// Upper left Diagonal
		int cr = row;
		int cc = col;
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		
		// Upper Right
		cr = row;
		cc = col;
		while(cr>=0 && cc< board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]) {
					System.out.print("q ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
