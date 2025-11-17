package Lecture23;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesItsCheese {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char arr[][] = new char[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();//row
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.charAt(j);	
			}
		}
	
		int ans[][] = new int[n][m];
		rec(arr,ans,0,0);
		if(count ==0) {
			System.out.println("NO PATH FOUND");
		}
	}

	public static void rec(char[][] arr, int[][] ans, int cr, int cc) {
		// TODO Auto-generated method stub
		if(cr == arr.length-1 &&  cc== arr[0].length-1) {//+ve base case
			ans[cr][cc] = 1;
			Display(ans);
			ans[cr][cc] = 0;
			count++;
			return;
		}
		if(cr<0 || cc<0 || cr>=arr.length || cc>=arr[0].length || arr[cr][cc]=='X') {
			return;
		}
		ans[cr][cc] = 1;
		arr[cr][cc] = 'X';
		rec(arr, ans, cr+1, cc);//D
		rec(arr, ans, cr, cc+1);//R
		rec(arr, ans, cr-1, cc);//U
		rec(arr, ans, cr, cc-1);//L
		ans[cr][cc] = 0;
		arr[cr][cc] = 'O';
		
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int[] is : ans) {
			System.out.println(Arrays.toString(is));
		}
		System.out.println();
	}

}
