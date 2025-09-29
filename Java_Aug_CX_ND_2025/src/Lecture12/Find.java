package Lecture12;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr =  new int[n][m];
		
		for ( int a[] : arr) {
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}  
		}
		 int target =  sc.nextInt();
		boolean ans = find(arr,target);
		System.out.println(ans);
		
		
	}

	public static boolean find(int[][] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] ==  target) {
					return true;
				}
			}
		}
		
		return false;
		
	}

}
